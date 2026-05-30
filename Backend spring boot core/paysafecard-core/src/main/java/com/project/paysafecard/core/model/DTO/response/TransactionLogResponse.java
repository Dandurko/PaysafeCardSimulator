package com.project.paysafecard.core.model.DTO.response;

import com.project.paysafecard.core.model.entity.Transaction;
import com.project.paysafecard.core.model.entity.TransactionState;
import com.project.paysafecard.core.model.entity.User;
import jakarta.validation.constraints.NotNull;

public record TransactionLogResponse(@NotNull User user, @NotNull TransactionState oldTransactionState, @NotNull TransactionState newTransactionState, @NotNull Transaction transaction){

}
