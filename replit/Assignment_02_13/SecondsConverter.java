package Assignment_02_13;
/*
Write a program that will take a number of seconds and converts it to a number of hours, minutes and seconds
Create a Scanner object
Declare four int variables: inputSeconds, hours, minutes, seconds
Ask the user to enter the total number of seconds:
Enter seconds:
Taking the given number of total seconds calculate how many hours come from that many seconds, then how many left over minutes can come from those seconds and finally how many leftover seconds there is.
Hint: Use % (remainder) and / operators to calculate the hours, minutes, and seconds

Ex:
  Enter seconds:
    3695
  1 hours, 1 minutes, and 35 seconds
Main topics: variables, primitive datatypes, String, Scanner, concatenation, operators
 */
import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
    //WRITE YOUR CODE BELOW:
        int inputSeconds, hours, minutes, seconds;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter seconds:");
        inputSeconds = input.nextInt();
        seconds = inputSeconds;

        hours = seconds/3600; // 3695 / 3600 = 1
        minutes = (seconds%3600)/60; // 3695 % 3600 = 95 / 60 = 1;
        seconds = (seconds%3600)%60; // 35;

        String time = hours+" hours, "+minutes+" minutes, and "+seconds+" seconds";
        System.out.println(time);


    }
}
