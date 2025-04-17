import java.util.Scanner;

public class StringSpawner {
    public static void main(String[] args) {
// creating and using string builder. use when you are making many changes to the string
        StringBuilder skills = new StringBuilder();

        skills.append("git ");
        skills.append("HTML ");
        skills.append("CCS ");
        skills.append(" and Bootstrap ");
        skills.append("javascript ");
        skills.append("java ");
        skills.append(" and express\n");

// using a string builder instead of normal string saves memory

        String mySkills = skills.toString();
        System.out.println(mySkills);
// ADDRESS BUILDER PRACTICE
    }

}
class AddressBuilder {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("please enter your first name: ");
        String firstName = myscanner.nextLine();

        System.out.println(" enter your full name : ");
        String fullName = myscanner.nextLine();

        String WholeName = fullName;

        System.out.println("your name is: " + WholeName);
    }

}
// breaking a program into classes , OOP(object oriented programming) and more

public class Main {
    public static void main(String[] args) {
        Person firstperson = new Person( "ray", 55 );
        Person secondPerson = new Person();
        Person secondPersonn = new Person();



    }
}