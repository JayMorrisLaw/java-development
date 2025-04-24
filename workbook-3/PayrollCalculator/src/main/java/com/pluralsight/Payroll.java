package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        // using try catch and buffered reader/ file reader
        try{
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the name of the file employee to process: ");
            scanner.nextLine();
            System.out.println(" enter tha name of the payroll file");
            scanner.nextLine();




            while ((line = bufferedReader.readLine())!= null){
                // this is a string array, used for a list of names
                String [] tokens = line.split("\\|");
               int id = Integer.parseInt(tokens[0]);
               String name = tokens[1];
               Double hoursWorked = Double.parseDouble(tokens[2]);
               Double payRate = Double.parseDouble(tokens[3]);

                int employeeId;
                Employee employee = new Employee (id, name, hoursWorked, payRate);


                System.out.printf("Employee ID: %d, Name: %s, Grosss Pay %.2f%n", employee.getEmployeeId()
                        , employee.getName(), employee.getGrossPay());
            }
            bufferedReader.close();


        } catch (Exception ex) {
            System.out.println("An error has occurred: ");
        }
    }
}
