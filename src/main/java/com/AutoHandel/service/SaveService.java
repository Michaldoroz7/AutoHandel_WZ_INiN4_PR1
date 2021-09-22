package com.AutoHandel.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SaveService {

    public static void savingMovesToFile(List<String> moves) throws IOException {
        FileWriter fileWriter = new FileWriter(createSaveFile());
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for(int i = 0; i < moves.size(); i++){
            printWriter.println(moves.get(i));
        }
        printWriter.close();
    }

    private static File createSaveFile(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateName = dateFormat.format(date);
        return new File(dateName + ".txt");
    }



}
