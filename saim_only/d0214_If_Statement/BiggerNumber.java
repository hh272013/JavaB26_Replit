package d0214_If_Statement;
/*
Create two number variables
Find and print which number is bigger between the two

Input:
50
45

output:
50 is bigger
 */

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any two numbers");
        int num01 = input.nextInt();
        int num02 = input.nextInt();

        if (num01 == num02) {
            System.out.println(num01+" is equal to "+num02);
        } else if (num01 > num02) {
            System.out.println(num01+" is bigger");
        } else {
            System.out.println(num02+" is bigger");
        }



    }
}
