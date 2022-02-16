package Assignment_02_16;
/*
Use if statements to help the student find out which grade level they will join based on their age. Use the following information to determine the results:
less than 3   -> ineligible
3-4           -> preschool
5             -> kindergarten
6-10          -> elementary school
11-13         -> middle school
14-18         -> high school
19+           -> college

Hint: Use a multi branch if statement
Main topics: if statements, primitive variables, operators

Ex:
  Input:
    8
  Output:
    elementary
Ex:
  Input:
    5
  Output:
    kindergarten
 */
import java.util.Scanner;
public class GradeLevel {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();

        //WRITE YOUR CODE BELOW
        if (age < 3)
            System.out.println("ineligible");
        else if (age < 5)
            System.out.println("preschool");
        else if (age == 5)
            System.out.println("kindergarten");
        else if (age < 11)
            System.out.println("elementary school");
        else if (age < 14)
            System.out.println("middle school");
        else if (age < 19)
            System.out.println("high school");
        else
            System.out.println("college");


    }
}
