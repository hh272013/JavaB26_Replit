package d0214_If_Statement;
/*
create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23, print: Good night
 */
import java.util.Scanner;
public class TimelyGreetings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What time is it in 24 hour format?");
        int currentTime = scan.nextInt();

        if(currentTime >= 1 && currentTime <= 11) {
            System.out.println("Good morning");
        }else if (currentTime >= 12 && currentTime <= 16){
            System.out.println("Good afternoon");
        }else if(currentTime >= 17 && currentTime <= 20){
            System.out.println("Good evening");
        }else if(currentTime >= 21 && currentTime <= 23){
            System.out.println("Good night");
        }else{
            System.out.println("You don't know time in 24 hour format?");
        }
    }

}
