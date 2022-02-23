package assignment_02_13;
/*
Given two variables num and cost with values (from Scanner), write a statement to print those values following the example below.
Note: You don't need to do anything with the Scanner. Use the variable as done before.
Main topics: print statement, variables, primitive types, concatenation, Scanner
Ex:
  Input:
    2
    5
    ​
  Output:
    num = 2
    cost = 5.0
 */
import java.util.*;
public class PrintVariable6 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double cost = in.nextDouble();

        //WRITE YOUR CODE BELOW THIS LINE:
        System.out.println("num = "+num+"\ncost = "+cost);

    }
}
