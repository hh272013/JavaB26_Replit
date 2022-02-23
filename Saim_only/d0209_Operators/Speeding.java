package d0209_Operators;

import java.util.Scanner;

public class Speeding {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your current speed: ");
        int currentSpeed = input.nextInt();
        int speedLimit = 35;
        boolean speeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? "+speeding);
    }
}
