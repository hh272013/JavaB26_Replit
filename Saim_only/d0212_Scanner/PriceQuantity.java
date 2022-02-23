package d0212_Scanner;
/*
Write a program that asks the user to enter a price and quantity and then calculate the revenue.
revenue = price × quantity.
 */
import java.util.Scanner;

public class PriceQuantity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a price and quantity");
        double price = input.nextDouble();
        int quantity = input.nextInt();
        double revenue = price * quantity;
        System.out.println("Total Revenue: $"+revenue);
    }
}
