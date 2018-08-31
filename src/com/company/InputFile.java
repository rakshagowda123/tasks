package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TimerTask;

public class InputFile extends TimerTask{

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long end = start + 600 * 1000;
        while (System.currentTimeMillis() < end) {
            String str;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a file name: ");
            String filename = scanner.nextLine();
            File f1 = new File(filename);
            try {


                boolean exists = f1.exists();
                if (exists == false) {
                    System.out.println("file doesn't exists");
                    return;
                }


                BufferedReader b = new BufferedReader(new FileReader(f1));
                while ((str = b.readLine()) != null) {
                    System.out.println(str);
                }
                BufferedReader br = new BufferedReader(new FileReader(f1));
                String readingLine;

                while ((readingLine = br.readLine()) != null) {
                    String[] array = readingLine.split(",");
                    if (array.length != 4) {
                        System.out.println("All attributes not present for record " + array);
                        return;
                    } else {

                        System.out.println("all attributes present proceeding further");
                        CheckDateFormat dob = new CheckDateFormat(array);
                        dob.start();

                    }
                }
            } catch (IOException ex) {
                System.out.println("Exception handled");
                return;
            }

        }
    }
}