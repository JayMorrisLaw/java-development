package com.pluralsight;

import java.util.Arrays;
import java.util.Collections;

public class ForEachLoops {
    public static void main(String[] args) throws InterruptedException {
        // making for each loops
        String[] nameList = {
                "natalie","jaden", "ricky", "zack", "cody",
                "ezre", "angie", "kim", "mike"
        };

        for(int i = 0; i < nameList.length ;i++) {
            System.out.println(nameList[i]);

            }

            System.out.println("================================");
            //writing more for each loops step1

            for (String name : nameList) {
                System.out.println(name);
            }

                System.out.println("================================");
                //sorting arrays
                Arrays.sort(nameList);
                // iter enter makes a for each loop
                for (String name : nameList) {
                    System.out.println(name);

        }
                // sort array backwards
        Arrays.sort(nameList, Collections.reverseOrder());

        for (String name : nameList) {
            System.out.println(name);

        }

    }
}
