package com.techelevator.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TELog {
    public static void log(String message){
        File dataFile = new File("logs\\search.logs");
        try(PrintWriter dataOutput = new PrintWriter(new FileOutputStream(dataFile, true))){
            dataOutput.append(message);

        }catch (FileNotFoundException e){
            System.out.println(message);
        }
    }
}
