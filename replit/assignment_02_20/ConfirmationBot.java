package assignment_02_20;
/*
Use a switch statement to create a confirmation bot. Given a response value as a char, output a message based on the following:
if the response is y print the message: Your request is being processed
if the response is n print the message: Thank you for your consideration
if the response is h print the message: Sorry, no live agents are currently available
if the response is anything other than y, n, or h print: Invalid entry, please try again
Main topics: switch statements, primitive variables
Example Flows:
Ex:
  Enter command:
  y
  Your request is being processed
Ex:
  Enter command:
  a
  Invalid entry, please try again
Ex:
  Enter command:
  n
  Thank you for your consideration
 */
import java.util.Scanner;
public class ConfirmationBot {
    public static void main(String[] args) {
    //DO NOT TOUCH BELOW
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter command:");
    char response = scan.next().charAt(0);
    //WRITE YOUR CODE BELOW
    String message;
    switch (response) {
        case 'y': case 'Y':
            message = "Your request is being processed";
            break;
        case 'n': case 'N':
            message = "Thank you for your consideration";
            break;
        case 'h': case 'H':
            message = "Sorry, no live agents are currently available";
            break;
        default:
            message = "Invalid entry, please try again";
    }

    System.out.println(message);

    }
}
