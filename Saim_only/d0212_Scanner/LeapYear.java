package d0212_Scanner;
/*
Find out if a given number is even or odd
 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = input.nextInt();
        boolean leapYear = year%4==0;
        if(leapYear){
            System.out.println("This is a leap year.");
        }else {
            System.out.println("This is not a leap year.");
        }
    }
}
