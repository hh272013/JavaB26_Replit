package d0215_Multibranch;
import java.util.Scanner;
public class Retake {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade out of 100");
        double grade = input.nextInt();

        System.out.println("Enter number of retakes");
        int attempts = input.nextInt();

        if(attempts == 1){
            grade -= (grade * 0.1);
        }else if(attempts == 2){
            grade -= (grade * 0.2);
        }else if(attempts == 3){
            grade -= (grade * 0.35);
        }
        System.out.println("Final Grade = "+grade);

    }
}
