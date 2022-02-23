package d0209_Operators;

import java.util.Scanner;

/*
create a class called KgTopounds, and write a program that can convert Kg
to pound and print the result
Ex:
kg = 10;
output:
10 kg equal to 22.0462 pounds
kg = 20
output:
20 kg equal to 44.0924 pounds
....
Hint: 1kg = 2.20462 pounds
 */
public class KgTopounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter weights in kg");
        double kgWeight = input.nextDouble();
        System.out.println(kgWeight * 2.20462);
    }
}
