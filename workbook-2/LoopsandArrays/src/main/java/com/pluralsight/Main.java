package com.pluralsight;

public class Main {
    public static void main(String[] args) {
// writing loops using a for loop
        // using breaks in loops stop the loop from continuing
        // using continue skips the rest of the code and sends you to the next congfiguration
        /* using continue adds all numbers up to 10 skipping multiples of 3 1+2+4+5+7+9 to 10
         */
        int sum =0;
        for(int i =1; i <= 10; i++){
            if(i % 3 == 0){
                continue;
            }
            sum +=i;

        }

        System.out.println("sum = " + sum);


    }
}
