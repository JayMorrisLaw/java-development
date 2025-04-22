package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    // create an array of vehicles that can hold 20 vehicles
    // each time u add a vehicle add +1
    private static Vehicle[] vehicles = new Vehicle[20];

    private static int numOfVehicles = 6;

    public static void main(String[] args) {
        // assign vehicles to the array
        vehicles[0] = new Vehicle(10112, "Ford explorer", "red", 45000, 11500f);
        vehicles[1] = new Vehicle(10112, "Ford explorer", "black", 45000, 11500f);
        vehicles[2] = new Vehicle(10112, "Ford explorer", "white", 45000, 11500f);
        vehicles[3] = new Vehicle(10112, "Ford explorer", "blue", 45000, 11500f);
        vehicles[4] = new Vehicle(10112, "Ford explorer", "orange", 45000, 11500f);
        vehicles[5] = new Vehicle(10112, "Ford explorer", "pink", 45000, 11500f);
        // create a scanner
        Scanner scanner = new Scanner(System.in);

        // create a while loop in order to make a menu

        while(true){
        // create menu for user
            System.out.println(" what do you want to do");
            System.out.println(" 1 - list vehicles");
            System.out.println(" 2- search make/model");
            System.out.println(" 3- search by price");
            System.out.println(" 4- search by color ");
            System.out.println(" 5- add a new vehicle");
            System.out.println(" 6- quit");
            System.out.println("enter your command: ");

            int command = scanner.nextInt();
            scanner.nextLine();
            // use switch to cover each option by user
            switch (command){
                case 1:
                    // list all vehicles , use a for loop to name each vehicle, foreach or for i work
                    System.out.println("vehicle inventory: ");
                    // for the i < part you need to insert num of vehicles variable
                    for (int i = 0; i < numOfVehicles ; i++) {
                        System.out.println(vehicles[i]);
                    }
                    break; // break is used to exit loops early
                case 2:
                    // search by make / model
                    // using a method to find vehicles
                    // this method was made outside of the class and needs to be called by typing in the name of the method and puttin the scanner in the parameters()
                    findVehiclesByMakeModel(scanner);
                    break;
                case 3:
                    // search by price
                    // using a method to find by price
                    findVehiclesByPrice(scanner);
                    break;
                case 4:
                    // search by color
                    findVehiclesByColor(scanner);
                    break;
                case 5:
                    // add a new vehicle
                    addVehicle(scanner);
                    break;
                case 6:
                    System.out.println("goodbye! ");
                    return;
                default:
                    System.out.println("invalid command");
                    break;

            }

        }

    }
    // method for adding a new vehicle
    // insert vehicle attributes , color make model price odometer etc
    public static void addVehicle(Scanner scanner){
        System.out.println(" enter vehicle ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();
        // consume new line character
        // prompt user to enter make/model
        System.out.println("enter make and model:");
        String makeModel = scanner.nextLine();
        // ask for color
        System.out.println(" enter color");
        String color = scanner.nextLine();
        // ask for odometer reading
        System.out.println(" enter mileage: ");
        int odometerReading = scanner.nextInt();
        // ask for price
        System.out.println(" enter price");
        float price = scanner.nextFloat();

        Vehicle vehicle = new Vehicle(id, makeModel, color, odometerReading, price);

      
        vehicles[numOfVehicles] = vehicle;
        numOfVehicles++; 
     

        System.out.println("vehicle added");


    }

    // using a method to list all vehicles not used
    private static void listAllVehicles (){
        System.out.println("vehicle inventory: ");
    // create a for loop
        for(int i = 0; i < numOfVehicles; i++){
            System.out.println(vehicles[i]);
        }
    }
    // method for finding vehicles by make/model
    // first step is to plug in the make+model from user
    // insert a  scanner
    // ask for make and model

    private static void findVehiclesByMakeModel (Scanner scanner){
        System.out.println("enter make and model");
        String makeModel = scanner.nextLine();

        // make a for loop to cover each element
        // comparing strings
        for (int i = 0; i < numOfVehicles; i++) {
            if (vehicles[i].getMakeModel().equalsIgnoreCase(makeModel)){
                System.out.println(vehicles[i]);

            }
        }
    }
// method to find vehicles by price
    private static void findVehiclesByPrice(Scanner scanner){
        System.out.println("enter minimun price: ");
        float minprice = scanner.nextFloat();

        System.out.println(" enter max price: ");
        Float maxPrice = scanner.nextFloat();

        boolean found = false;

        for (int i = 0; i < numOfVehicles; i++){
            if(vehicles[i].getPrice() >= minprice && vehicles[i].getPrice()<= maxPrice){
                System.out.println(vehicles[i]);
                found = true;


            }
        }

        if (found){
            System.out.println("no vehicles found");

        }

    }
// method to find vehicles by color
    private static void findVehiclesByColor(Scanner scanner) {
        System.out.println("Enter color: ");
        String color = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < numOfVehicles; i++) {
            if (vehicles[i].getColor().equalsIgnoreCase(color)) {
                System.out.println(vehicles[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles found.");
        }
    }
}
