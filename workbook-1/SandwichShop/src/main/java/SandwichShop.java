import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        double basePrice = 0.0;


        System.out.println("choose your size 1 for regular or 2 for large ");
        int choice = myscanner.nextInt();

        if (choice == 1) {
            basePrice = 5.45;
        } else if (choice == 2) {
            basePrice = 8.95;
        } else {
            System.out.println(" invalid choice please select one of the sizes 1 or 2 ");
            return;

        }
        System.out.println(" what is your age ");
        int age = myscanner.nextInt();

        double finalPrice = 0.0;


        if (age <= 17) {
            finalPrice = basePrice - (basePrice * .10);
        } else if (age >= 65) {
            finalPrice = basePrice - (basePrice * .20);
        }
        else {
            finalPrice = basePrice;
        }

        System.out.printf("Final price of the sandwich is: $%.2f", finalPrice);


    }
}



