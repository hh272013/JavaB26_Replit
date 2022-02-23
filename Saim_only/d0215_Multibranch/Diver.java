package d0215_Multibranch;
/*
create a class Diver
You are diving in the ocean. Your oxygen tank has a certain level (number)
declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:
    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%
 */
import java.util.Scanner;
public class Diver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter oxygen tank level:");
        int number = input.nextInt();

        if (number > 100) {
            System.out.println("INVALID ENTRY");
        } else if (number > 90){
            System.out.println("Your tank is more than 90% full");
        } else if (number > 80) {
            System.out.println("Still okay");
        } else if (number > 70) {
            System.out.println("Don't go too far");
        } else if (number > 60) {
            System.out.println("Start to head back");
        }else if (number >= 50) {
            System.out.println("Be careful now you at at 50%");
        }else if (number > 0) {
            System.out.println("DANGER! Oxygen running out...");
        }else if (number == 0) {
            System.out.println("EMPTY TANK");
        }else {
            System.out.println("INVALID ENTRY");
        }


    }
}
