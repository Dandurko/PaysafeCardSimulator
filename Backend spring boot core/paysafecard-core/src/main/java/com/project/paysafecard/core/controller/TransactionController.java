package com.project.paysafecard.core.controller;

import com.project.paysafecard.core.model.DTO.response.TransactionResponse;
import com.project.paysafecard.core.model.entity.Transaction;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.repository.TransactionRepository;
import com.project.paysafecard.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping
    public List<TransactionResponse> getTransactionsForUser(){

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        User user = userRepository.findUserByEmail(userDetails.getUsername());

        List<Transaction> transactions = transactionRepository.findAllByUser(user);

        return transactions.stream()
                .map(transaction -> new TransactionResponse(
                        transaction.getAmount(),
                        transaction.getUser(),
                        transaction.getGeneratedPaysafe(),
                        transaction.getTransactionState(),
                        transaction.getCreatedAt()
                ))
                .toList();

    }
}
