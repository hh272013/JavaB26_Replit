package d0214_If_Statement;
import java.util.Scanner;
public class UpperCaseLowerCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type any word");
        String word = input.nextLine();
        char letter = word.charAt(0);

        if (letter >= 97 && letter <= 122){
           System.out.println(letter);
           System.out.println("First letter is lowercase");
       }
        if (letter >= 65 && letter <= 90){
            System.out.println(letter);
            System.out.println("First letter is uppercase");
        }


    }
}
