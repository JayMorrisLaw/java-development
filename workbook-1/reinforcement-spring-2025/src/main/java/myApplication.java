import java.util.Scanner;

public class myApplication {
    public static void main(String[] args) {
// using a scanner to print interactive messages
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter your name ");
        String name =  scanner.nextLine();

        System.out.println("enter your age ");
        int age = scanner.nextInt();

        System.out.println(" name: " + name);
        System.out.println(" age: " + age);


        if (age >= 18) {
            System.out.println(" you are old enough to vote ");
        } else {
            System.out.println("you are not old enough to vote ");
        }

        printMessage(name, age);
    }
    // calling a method^ printmessage
    // creating a method to print a message ^ " hello jaden you are 21 years old"
    public static void printMessage(String name, int age ){
        System.out.println(" Hello, " + name + " you are " + age + " years old ");


        double getNumber = (Scanner);
    }


    public static double getNumber(Scanner scanner){
        System.out.println("enter a number: ");
        return scanner.nextDouble();
    }
}

