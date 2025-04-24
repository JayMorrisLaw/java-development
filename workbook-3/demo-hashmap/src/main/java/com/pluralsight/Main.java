package com.pluralsight;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // a hashmap stores in key/value pairs, the 2 strings are key/value
        //creating a hashmap
        HashMap<String,String> statesAndCapitals = new HashMap<>();
        // adding an element to a hashmap using .put
        statesAndCapitals.put("FL", "Orlando");
        statesAndCapitals.put("TX", "dallas");
        statesAndCapitals.put("CA", "oakland");
        statesAndCapitals.put("GA", "atlanta");
        statesAndCapitals.put("NY", "new york");

        System.out.println(statesAndCapitals);
        // how to reach an element inside of a hashmap using .get
        System.out.println("the capital of texas is: ");
        System.out.println(statesAndCapitals.get("TX"));

        statesAndCapitals.remove("WA");
        System.out.println(statesAndCapitals);

        for (String value : statesAndCapitals.values()){
            System.out.println(value);
        }

        // diff form of a hashmap

       /* HashMap<Integer,Product> idsAndProducts = new HashMap<>();
        Product newProduct = new Product(1, "potato", 123);
        idsAndProducts.put(newProduct.getProductID(), newProduct); */
       // takes the value of the keyset
        for(String key: statesAndCapitals.keySet()){
            System.out.println(key + ": " + statesAndCapitals.get(key));
        }

    }
}
