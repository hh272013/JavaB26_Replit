package d0212_Scanner;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:");
        long num = input.nextLong();
        boolean isEven = num%2 == 0;
        if(isEven){
            System.out.println("This is an even number.");
        }else {
            System.out.println("This is an odd number.");
        }
    }
}
