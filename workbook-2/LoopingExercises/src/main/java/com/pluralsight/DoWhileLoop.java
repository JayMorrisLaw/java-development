package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {
        // using while loops step 1
        int count =0;
        // making a do while loop, starting from 0 you use < starting from 1 use <=
        do {
            System.out.println(" i love potato");
            count++;
            // count ++ prevents infinite loop
        } while (count < 5);
    }
}
