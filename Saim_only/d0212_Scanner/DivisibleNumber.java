package d0212_Scanner;
import java.util.Scanner;
/*
Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the result
 */
public class DivisibleNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = input.nextInt();
        if(number%2 == 0 && number%3 == 0){
            System.out.println("This is an even number and it is divisible by three.");
        }else if (number%2 == 0){
            System.out.println("This number is an even number.");
        }else if(number%3 == 0){
            System.out.println("This number is divisible by three.");
        }else if(number%5 == 0){
            System.out.println("This number is divisible by five.");
        }else {
            System.out.println("This number is not divisible by 2, 3, or 5");
        }
    }
}
