import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.println("Enter hours worked: ");
        Float hoursWorked = myScanner.nextFloat();


        System.out.println("Enter pay rate:  ");
        Float payRate = myScanner.nextFloat();

        float grossPay = payRate * hoursWorked;
        System.out.println(" this is how much you made "+ grossPay);







    }
}
