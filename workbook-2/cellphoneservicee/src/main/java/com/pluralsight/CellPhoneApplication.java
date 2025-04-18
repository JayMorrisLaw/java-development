package com.pluralsight;
// working with objects, cellphone activity
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // 1 create new cellphone using a constructor

        CellPhone cellPhone1 = new CellPhone();

        // 2 add a scanner

        Scanner newScanner = new Scanner(System.in);

        // 3 prompt user for information using scanner, serial# owner carrier etc

        System.out.println("What is the serial number");
        int serialNumber = newScanner.nextInt();
        cellPhone1.setSerialNumber(serialNumber);

        // 4 when switching from int to string use newScanner.nextLine();
        newScanner.nextLine();

        System.out.println("what is the model:");
        String phoneModel = newScanner.nextLine();
        cellPhone1.setPhoneModel(phoneModel);

        System.out.println("who is your phone carrier ");
        String carrier = newScanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.println(" what is the phone number");
        String phoneNumber = newScanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.println("who is the owner ");
        String owner = newScanner.nextLine();
        cellPhone1.setOwner(owner);

        //5  close the scanner

        newScanner.close();

        // 6 display the properties using getters,, \n is equivalent to hitting enter, starts text on new line

        System.out.println("\nCellPhone Details");
        System.out.println("serial number: "+ cellPhone1.getSerialNumber());
        System.out.println("phone model: "+ cellPhone1.getPhoneModel());
        System.out.println("carrier: "+ cellPhone1.getCarrier());
        System.out.println("phone number: "+ cellPhone1.getPhoneNumber());
        System.out.println("owner: "+ cellPhone1.getOwner());
// 7 done
    }
    public class Cellphoneclass2 {
        public static void main(String[] args) {


        }
    }
}
