package com.pluralsight.main;

import com.pluralsight.db.DataManager;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // user and password are needed
        if (args.length !=2){
            System.out.println("user and password are needed!");
            System.exit(1);
        }
        // edit config with username and password
        String username = args[0]; //using arg for security reason
        String password = args[1];

        // add datasource after adding dependency in pom.xml
        // add url for sakila

        BasicDataSource sakilaDataSource = new BasicDataSource();
        sakilaDataSource.setUrl("jdbc:mysql://localhost:3306/sakila"); //url that connects to sakila db
        sakilaDataSource.setUsername(username);
        sakilaDataSource.setPassword(password);
        // make new datamanager
        DataManager dataManager = new DataManager(sakilaDataSource);

        // create menu first using a scanner
        Scanner scanner = new Scanner(System.in);
        //next  use a while loop for the menu while using a boolean for true (while running)

        while(true){
            // show menu
            System.out.println("menu");
            System.out.println("1 insert direct");
            System.out.println("2 insert with generated keys");
            System.out.println("3 update record");
            System.out.println("4 delete record");
            System.out.println("5 exit ");
            System.out.println("choose an option");

            int choice = scanner.nextInt();
            scanner.nextLine();
            // use a switch case for choices

            switch (choice) {
                case 1 -> {
                    // add method for insert country using data manager
                    System.out.println("enter country name you want to add: ");
                    String country = scanner.nextLine();
                    dataManager.insertIntoDirect(country);
                }

                case 2 ->  {
                    // shows country name u inserted with generated key
                    System.out.println("enter country name to insert");
                    String countryNameWithKey = scanner.nextLine();
                    dataManager.insertWihGeneratedKeys(countryNameWithKey);

                }

                case 3 ->  {
                    System.out.println("enter a new description");
                    String newDescription = scanner.nextLine();

                    System.out.println("enter ID pf film u want to update: ");
                    int filmID = scanner.nextInt();
                    scanner.nextLine();
                    dataManager.updateRecord(newDescription, filmID);

                }

                case 4 ->  {
                    System.out.println("enter a country to delete");
                    String deletedCountry = scanner.nextLine();
                    dataManager.deleteRecord(deletedCountry);

                }

                case 5 ->  {
                    System.out.println("exiting...");
                    System.exit(0);
                }
                default ->  System.out.println("invalid choice please try again");
            }


        }


    }
}
