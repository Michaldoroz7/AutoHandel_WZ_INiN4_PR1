package com.AutoHandel.service;

import com.AutoHandel.model.LogInterface;
import com.AutoHandel.repository.LogRepository;

import java.util.Objects;

public class LogService implements LogInterface {

    public static void saveTransactionLogs(String playerName, Double playerBudget, Double carPrice, String transactionType) {

        if (Objects.equals(transactionType, "bought")) {
            LogRepository.addLogs("Player: " + playerName +
                    " bought car for price: " + carPrice +
                    " his budget after transaction: " + playerBudget);
        } else if (Objects.equals(transactionType, "sold")){
            LogRepository.addLogs("Player: " + playerName +
                    " Sold car for price: " + carPrice +
                    " his budget after transaction: " + playerBudget);
        }
    }
}
