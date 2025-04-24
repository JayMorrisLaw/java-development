package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarOutputStream;

public class demoArrayLists {
    public static void main(String[] args) {
        // COLLECTIONS
        /* a collection is similar to an array in the way that a COLLECTION is a single container
         that contains 0 or more individual objects.
         */
        // creating an array of names
        String[] names = new String [5];
        // inserting names into the spaces of the array
        names [0] = "jaden";
        names [1] = "raymond";


        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);

        }

        // creating an ARRAY LIST
        /* specify as a list instead of an array list,
         Both ways are correct but declaring it as a list allows you to change
         the type later, makes it more flexible.
         */
       // ORIGINAL- ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        // adding to an array list using .add
        numbers.add(2);
        numbers.add(23);
        //create a new list of string names kids
        List<String> kids = new ArrayList<>();
        // add elements into the list using kids.add(), since its a list of strings only Strings can be added
        kids.add(" nathan");
        kids.add(" jason");
        kids.add(" max");
        // for kids we use size instead of length like we do w integers
        // size is used for array lists
        for (int i = 0; i < kids.size(); i++) {
            System.out.println((i+1) + kids.get(i));
            System.out.println("=========================");

            // method to call a specific kid depending on the index you input
            /* an important difference between an array and array list is the
            lists flexibility. you can create 2 elements and add as many and remove
            as many as you want. an array LIST is more flexible than an ARRAY.
             */
            // updating elements inside of the array list
            kids.add(2, "maxwell");
            kids.set(2,"maxx");
            // changing max to maxwell using .set
            // removing from an array list uing kids.remove

            kids.remove(1);
            kids.set(1,"Nate");
            // this will remove index 1 from the array list
            /* while removing from an array list the next value
            will be moved into the spot, ex if i remove jason max will
            take his place. you can also add names back but they will be added at
            the end of the list
             */



        }

        }

        }







