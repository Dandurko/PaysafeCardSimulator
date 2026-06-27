package com.project.paysafecard.core.model.DTO.response;

import com.project.paysafecard.core.model.entity.GeneratedPaysafe;
import com.project.paysafecard.core.model.entity.Transaction;
import com.project.paysafecard.core.model.entity.TransactionState;
import com.project.paysafecard.core.model.entity.User;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionResponse(@NotNull BigDecimal amount, @NotNull User user,
                                  @NotNull GeneratedPaysafe generatedPaysafe,
                                  @NotNull TransactionState transactionState,
                                  @NotNull LocalDateTime createdAt
) {
}
