package d0212_Scanner;
/*
Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them to enter their favorite book
Print all the values from the inputs
 */
import java.util.Scanner;
public class AgeNumberBook {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Enter your favorite number:");
        long number = input.nextLong();
        input.nextLine();
        System.out.println("Enter your favorite book:");
        String book = input.nextLine();
        System.out.println("\nAge: "+age+"\nNumber: "+number+"\nBook: "+book);
    }
}
