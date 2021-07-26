package com.AutoHandel.repository;

import java.util.ArrayList;
import java.util.List;

public class LogsRepository {

    private static List<String> transactionLogs = new ArrayList<>();

    public static List<String> getAllLogs(){
        return transactionLogs;
    }

    public static void addLogs(String log){
        transactionLogs.add(log);
    }
}
