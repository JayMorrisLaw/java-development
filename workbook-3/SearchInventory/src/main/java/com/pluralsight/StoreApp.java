package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        List<Product> inventory = getInventory();

        ListAllProducts(inventory);
    }
    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<>();
        // put your code here
       /* inventory.add(new Product(1, "shirt", 19.99));
        inventory.add(new Product(2, "pants", 29.99));
        inventory.add(new Product(3, "shoes", 49.99));
        inventory.add(new Product(4, "hat", 14.99));
        inventory.add(new Product(5, "jacket", 79.99));
*/
        //bonus 1
        String line;
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            System.out.println(bufferedReader);
// using a while loop to read from the file
            while((line = bufferedReader.readLine())!= null){
                //this command cuts the file line by line
                String [] potato = line.split("\\|");
                int id = Integer.parseInt(potato[0]);
                String name = potato[1];
                double price = Double.parseDouble(potato[2]);
                inventory.add(new Product(id, name, price));
            }
        } catch (Exception e){
            System.out.println("an error has occurred");
        }
        return inventory;
    }
    public static void ListAllProducts(List<Product> productsLIst) {
        System.out.println("we carry the following inventory: ");
        for (Product product : productsLIst) {
            System.out.println(product);

        }
    }
}

