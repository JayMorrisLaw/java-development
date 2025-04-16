import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;
        String suffix;

        System.out.println(" please enter your first name: ");
        firstName = myScanner.nextLine();

        System.out.println(" please enter your middle name: ");
        middleName = myScanner.nextLine();

        System.out.println(" please enter your last name: ");
        lastName = myScanner.nextLine();

        System.out.println(" please enter a suffix: ");
        suffix = myScanner.nextLine();

        System.out.println(" your full name is: " + firstName + middleName + lastName + suffix );

        String wholeName = firstName + " " + middleName + " " + lastName + " " + suffix ;

        System.out.println( wholeName);

        System.out.println("======================================================");

        System.out.println( "yo whats up " + wholeName);




































    }
}
