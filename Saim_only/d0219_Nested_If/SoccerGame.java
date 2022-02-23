package d0219_Nested_If;
/*
declare and assign a minutes variable
use the minutes value to determine how much time is left in the soccer game
use these ranges to determine the outputs:
	- any number less than 0 and more than 90 are not valid:
		when the minutes is less than 0:
			print: minutes cannot be a negative number
		when the minutes is more than 90:
			print: games cannot be longer than 90 minutes
	- when the minutes are between 90 - 75
		print: just getting started
	- when the minutes are between 74 - 60
		print: players are doing their best
	- when the minutes are between 59 - 30
		print: middle of the game is going great
	- when the minutes are between 29 - 0
		print: the end of the same is approaching
 */
import java.util.Scanner;
public class SoccerGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("How many minutes are left in the soccer game?");
        int minutesLeft = scan.nextInt();

        if(minutesLeft < 0 || minutesLeft > 90){
            if(minutesLeft < 0){
                System.out.println("Minutes cannot be a negative number.");
            }else {
                System.out.println("Minutes cannot be more than 90 minutes.");
            }
        }else if(minutesLeft <= 90 && minutesLeft >= 75){
            System.out.println("Just getting started");
        }else if(minutesLeft < 75 && minutesLeft >= 60){
            System.out.println("Players are doing their best");
        }else if(minutesLeft < 60 && minutesLeft >= 30){
            System.out.println("Middle of the game is going great");
        }else {
            System.out.println("The end of the same is approaching");
        }



















    }
}
