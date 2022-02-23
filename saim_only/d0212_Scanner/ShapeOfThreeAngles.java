package d0212_Scanner;
/*
Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
 */
import java.util.Scanner;
public class ShapeOfThreeAngles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three angles:");
        int angle01 = input.nextInt();
        int angle02 = input.nextInt();
        int angle03 = input.nextInt();
        boolean isCircle = (angle01 + angle02 + angle03) == 360;
        boolean isTriangle = (angle01 + angle02 + angle03) == 180;
        if(isCircle){
            System.out.println("These angles form a circle.");
        }else if(isTriangle){
            System.out.println("These angles form a triangle.");
        }else {
            System.out.println("These angles do not form a triangle or a circle.");
        }
    }
}
