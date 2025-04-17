import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
// converting a string step by step to an int or number
        // use parsed number to convert string, adding the 1 just adds the character

        String stringNumber = "111";
        System.out.println(stringNumber + 1); // 1111

        int parsedNumber = Integer.parseInt(stringNumber); // conversion

        int result = parsedNumber + 1; // 112
        System.out.println(result);

        // the parse operator does all conversion/ using DATE, converting string to date using LocalDate

        String userInput = "2002-10-17"; //YYYY-MM-DD

        LocalDate birthDay = LocalDate.parse(userInput);
        System.out.println(birthDay);
        // date time formatter changes format of date

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the date that you want (mm/dd/yy): ");
        String dateInputFromUser = scanner.nextLine();
// it has to follow the same pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm/dd/yy");


        LocalDate userDate = LocalDate.parse(dateInputFromUser, formatter);

        System.out.println(birthDay);





    }
}
