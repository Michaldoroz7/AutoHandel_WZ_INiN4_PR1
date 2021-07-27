package com.AutoHandel.repository;

import java.util.ArrayList;
import java.util.List;

public class LogRepository {

    private static List<String> transactionLogs = new ArrayList<>();

    public static List<String> getAllTransactionLogs(){
        return transactionLogs;
    }

    public static void addLogs(String log){
        transactionLogs.add(log);
    }
}
