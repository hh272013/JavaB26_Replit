package assignment_02_16;
/*
Use if statements to determine if the given int grade is a passing grade. Use the following ranges to determine the result:
if the grade is bigger than or equals to 90 output excellent
if the grade is bigger than or equals to 70 and smaller than 90 output good
if the grade is bigger than or equals to 60 and smaller than 70 output pass
if the grade is smaller than 60 output fail
Note: Can be done with 4 separate if statement or a multi branch if statement
Main topics: if statements, primitive variables, operators

Ex:
  Input:
    93
  Output:
    excellent
Ex:
  Input:
    70
  Output:
    good
Ex:
  Input:
    46
  Output:
    fail
Ex:
  Input:
    80
  Output:
    good
 */
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();

        //WRITE YOUR CODE BELOW:
        if(grade >= 90 && grade <= 100){
            System.out.println("excellent");
        }else if(grade >= 70 && grade < 90){
            System.out.println("good");
        }else if(grade >= 60 && grade <= 70){
            System.out.println("pass");
        }else if(grade < 60){
            System.out.println("fail");
        }else {
            System.out.println("invalid");
        }


    }
}
