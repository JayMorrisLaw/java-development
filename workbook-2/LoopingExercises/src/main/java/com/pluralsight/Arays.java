package com.pluralsight;

public class Arays {
    public static void main(String[] args) {
        /* Arrays practice, an array is a group of objects or numbers or strings combined in one variable
       when the array is set it cannot be changed
         */
        int firstNumber = 1;
        // making an array or numbers
        int[] listOfNumbers = { 34, 34, 25, 24, 234, 234 ,234};
        // empty array
        int[] newArrayOfNumbers = new int[2];
        // using indexes to print out selected number
        // System.out.println(listOfNumbers[3]);
        // using a for loop to print all numbers
        for (int i = 0; i < listOfNumbers.length ; i++ ){
            System.out.println(listOfNumbers[i]);

            // arrays using boolean

            Boolean[] boolArray = new Boolean[4];

            for(i = 0; i <= boolArray.length; i++){
                System.out.println(boolArray[i] + " ");
            }



        }
    }
}
