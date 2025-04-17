import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = myscanner.nextLine();

        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);


// prompt user for date

        System.out.println("Please enter the show date (MM/dd/yyyy): ");
        String showDate = myscanner.nextLine();

// parse date with date time formatter

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(showDate, formatter);

        System.out.println("Please enter the amount of tickets you need: ");
        int ticketNum = myscanner.nextInt();

        String ticketString = ticketNum == 1 ? " ticket " : " tickets ";
        String confirmationMessage = ticketNum + ticketString + " reserved for " + "under " + lastName + ", " + firstName;
        System.out.println(confirmationMessage);





    }
}
