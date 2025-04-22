package com.pluralsight;

public class Array2 {
    public static void main(String[] args) {
        //copying arrays, make one empty and one with RWB
        String[] colors = {"red", "white","blue"};
        String[] copy = new String[3];

         // copied the colors to the empty array
        //copy = colors; // this is referring to the same array
        // changed one color

        // properly copy an array
        // start with the array ur copying FROM,(COLORS) ,+ using the index of the first object, (0)
        // the second 0 represents where you will paste the copy from the first array to the SECOND array using the index
        // the third number (3) represents the limit of what ur copying or how many elements ur copying
        System.arraycopy(colors,0,copy,0,3);
        // changed one color to black
        colors[1] = "black";

        System.out.println("colors");
        for (String color : colors) {
            System.out.println(color);
        }
            System.out.println("=================");

            System.out.println("copy: ");
            for (String copyElement  : copy) {
                System.out.println(copyElement);


            }
            System.out.println("===========");
        }
    }

