package d0214_If_Statement;

import java.util.Scanner;

public class Next_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        /*
        If we put SPACE after number and type full name, correct message will be printed except with an extra space in front of the name
        If we hit ENTER after entering the number, the code will be executed without take the full name and printing it
        Therefore, we should add an extra nextLine() before fullName to catch the ENTER key
         */
        input.nextLine(); // This solves the problem
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println(fullName+" - "+number);
    }
}
