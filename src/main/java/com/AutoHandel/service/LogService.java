package com.AutoHandel.service;

import com.AutoHandel.model.LogInterface;
import com.AutoHandel.repository.LogRepository;

public class LogService implements LogInterface {

    public static void saveTransactionLogs(String playerName, Double playerBudget, Double carPrice) {
        LogRepository.addLogs("Player: " + playerName +
                " bought car for price: " + carPrice +
                " his budget after transaction: " + playerBudget);
    }
}
