package com.pluralsight;

import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 70000;
        double garySalary = 50000;
        double highestSalary = Math.max(bobSalary ,garySalary);
        System.out.println("highest salary is " + highestSalary) ;

        Scanner myscanner; =house firstnum1;
        firstnum1



        double carPrice = 125.50;
        double truckPrice = 135.30;
        double cheapestCar = Math.min(carPrice, truckPrice);
        System.out.println("Cheapest car is " + cheapestCar);



        double variable = 5.0;
        double squareRoot = Math.sqrt(variable);
        System.out.println("the square root is " + variable);

        // question 1
        double jimSalary = 55000.0;
        double larrySalary = 65000.0;
        double biggestSalary = Math.max(jimSalary , larrySalary);
        System.out.println(" the highest salary is "+ biggestSalary);

        // number 2
        double carrPrice = 34000.0;
        double truckkPrice = 18000.0;
        double minPricee = Math.min( carPrice, truckPrice);
        System.out.println(" the cheapest price is "+ minPricee);

        //number 3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(" the area of the circle is "+ area);

        double num1 = 5.0;
        double sqrtNum1 = Math.sqrt(num1);
        System.out.println(" the square root of " + num1 + "is" + sqrtNum1);

        // 5 find and display the distance between the points
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1 ,2) + Math.pow(y2 - y1,2));
        System.out.println(" the distance between the points is "+ distance);

        // 6 find and display the absolute (positive) value of a variable after it is set to -3.8
        double num2 = -3.8;
        double absNum2 = Math.abs(num2);
        System.out.println("the absolute value of " + num2 + " is " + absNum2);

        // 7 find and display a random number between 0 and 1
        double randomNum = Math.random();
        System.out.println( "the random number is " + randomNum);

        // WRITING PRINT TO SCREEN, println will make multiple lines, print will print 1
        System.out.println(" hello");
        System.out.println(" world ");
        System.out.print(" hello world ");

        System.out.println("===================");

        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;
        System.out.println(totalDue);
        System.out.println("total due is: " + String.format( "%.2f", totalDue));

        System.out.printf("total due is: %.2f ", totalDue);

        int id = 10135;
        String name = "brandon plyers";
        float pay = 5293.77f;

        System.out.printf( "%s (id: %d ) $%.2f ", name, id, pay);

        // reading input with scanner






    }


    }

}