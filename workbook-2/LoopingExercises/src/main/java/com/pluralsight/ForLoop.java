package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
//   using for loops to count down from 10, count++ adds and count-- subtracts
        for (int count = 10; count >= 1; count-- ){
            System.out.println("countdown: " + count);
            Thread.sleep( 1000); // this slows the countdown by 1 sec
        }
        System.out.println("launch ");

        // doing the same counting up now
        for (int count = 1; count <= 10; count++){
            System.out.println(" countup: " + count);
            Thread.sleep(1000);
        }
        System.out.println(" countup ");

        // same behavior but using a "trick"

        for (int i = 1; i<= 10; i++){
            System.out.println(11-1);
            Thread.sleep(1000);


        }
        System.out.println("launch");

    }
}
