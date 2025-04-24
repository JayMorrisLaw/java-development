package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStoriesApplication {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Select a story file to read ");
        String fileName = myscanner.nextLine();

        try {
            FileInputStream fis = new FileInputStream(fileName);
            Scanner scanner = new Scanner(fis);
            int LineNumber = 1;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
