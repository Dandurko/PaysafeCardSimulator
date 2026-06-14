package com.project.paysafecard.core.controller;

import com.project.paysafecard.core.model.DTO.request.GeneratedPaysafeDepositRequest;
import com.project.paysafecard.core.model.DTO.request.PaysafeToGenerateRequest;
import com.project.paysafecard.core.model.DTO.response.GeneratedPaysafeResponse;
import com.project.paysafecard.core.model.DTO.response.PaysafeCardRedeemResponse;
import com.project.paysafecard.core.repository.GeneratedPaysafeRepository;
import com.project.paysafecard.core.repository.UserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/paysafe")
public class PaysafeController {

    @Autowired
    GeneratedPaysafeRepository generatedPaysafeRepository;

    @Autowired
    UserRepository userRepository;

    //TODO set role in userdetails
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/generatePaysafe")
    public GeneratedPaysafeResponse generatePaysafe(PaysafeToGenerateRequest paysafeToGenerateRequest) {

        /*

// also log
    int maxAttempts = 5;

    for (int i = 0; i < maxAttempts; i++) {
        String paysafeHash = quarkusService.generatePaysafeHash();

        try {
            GeneratedPaysafe generated = new GeneratedPaysafe();
            // set correct attributes to PaysafeEntity

            generatedPaysafeRepository.save(generated);

            return new GeneratedPaysafeResponse(
                hashService.decode(paysafeHash),generated.validTill
            );

        } catch (DataIntegrityViolationException e) {
            // hash exists
        }
    }

    throw new IllegalStateException("Could not generate unique paysafe code");
        */
        return null;
    }

    @PreAuthorize("hasRole('USER')")
    @PostMapping("/redeemPaysafe")
    @Transactional
    public PaysafeCardRedeemResponse redeemPaysafe(@RequestBody @Valid GeneratedPaysafeDepositRequest generatedPaysafeDepositRequest) {
/*
        if (generatedPaysafeDepositRequest.amount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException();
        }

        String paysafeCardHash = hashService.encode(generatedPaysafeDepositRequest.paysafeNumber());

        GeneratedPaysafe generatedPaysafe = generatedPaysafeRepository.findByPaysafeCardHash(paysafeCardHash);

        if(generatedPaysafe==null){
            //throw ex
        }

        if (generatedPaysafe.getValidTill().isBefore(LocalDateTime.now())) {
            //throw an exception
        }

        BigDecimal paysafeCardBalance = generatedPaysafe.getAmount().subtract(generatedPaysafeDepositRequest.amount());

        if (paysafeCardBalance.compareTo(BigDecimal.ZERO) < 0) {
//throw exception not enough credit
        }

        generatedPaysafe.setAmount(paysafeCardBalance);

        generatedPaysafeRepository.save(generatedPaysafe);

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        User user = userRepository.findUserByEmail(userDetails.getUsername());
        BigDecimal userBalance = user.getBalance();
        user.setBalance(userBalance.add(generatedPaysafeDepositRequest.amount()));

        userRepository.save(user);

        return new PaysafeCardRedeemResponse(user.getBalance(), paysafeCardBalance);
*/
        return null;
    }

}


