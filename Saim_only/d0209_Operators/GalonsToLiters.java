package d0209_Operators;

import java.util.Scanner;

public class GalonsToLiters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter gallons: ");
        double gallons = input.nextDouble();
        double liters = gallons * 3.78541;
        System.out.println(gallons +" gallons equal to "+liters+" liters");
    }
}
