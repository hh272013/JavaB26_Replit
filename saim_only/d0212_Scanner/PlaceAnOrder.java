package d0212_Scanner;
import java.util.Scanner;
public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name:");
        String product = input.nextLine();
        System.out.println("Enter the price:");
        double price = input.nextDouble();
        System.out.println("Enter the quantity");
        int quantity = input.nextInt();input.nextLine();
        System.out.println("Enter your full name:");
        String name = input.nextLine();
        double total = price * quantity;
        System.out.println(name+", your order for "+quantity+" "+product+" has been places. Your total is $"+total);
    }
}
