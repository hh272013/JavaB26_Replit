package Assignment_02_13;
import java.util.*;
/*
It is finally time for you to use Scanner yourself!
You will be accepting 3 numbers from the console (Using Scanner) and adding them together
Declare four int variables: num1, num2, num3, sum
Create a Scanner object named scan
Your program should follow this flow:
Console shows: Enter 3 numbers:
Using Scanner take three inputs from the console and store the values into your variables num1, num2, and num3
Add the three numbers and assign the result to the sum variable
Finally, print the following:
 Sum of numbers: $ValueOfSum
 Sum of numbers: $ValueOfSum
Ex:
  ​
    Enter 3 numbers:
      4
      6
      2
    Sum of numbers: 12
Ex:
    Enter 3 numbers:
      4
      6
      2
    Sum of numbers: 12
Main topics: variables, primitive datatypes, Scanner, concatenation, operators
 */
public class AddNumbers {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW:
        int num1, num2, num3, sum;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        sum = num1 + num2 + num3;
        System.out.println("Sum of numbers: "+sum);
    }
}
