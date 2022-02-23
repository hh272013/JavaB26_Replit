package d0219_Nested_If;
/*
The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes

	duration of less than or equal to 0:
		Movies cannot be less than 0 minutes
	duration of more than 4:
		Movies cannot be more than 4 hours

	for all other duration uses the following values to display the price of the tickets

		duration 	--> price
		1.0 		--> 8.99
		1.5 		--> 10.50
		2.0 		--> 12.99
		2.5 		--> 14.50
		3, 3.5 or 4 --> 15.99

 */

import java.util.Scanner;

public class MovieCost {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter movie duration as hours.minutes");
        double movieDuration = input.nextDouble();

        String moviePrice = "This movie costs $";
        String message = "";

        if(movieDuration < 0 || movieDuration > 4){
            if(movieDuration < 0){
                System.out.println("Movie cannot be less than 0 minutes");
            }else {
                System.out.println("Movie cannot be more than 4 hours");
            }
        }else if(movieDuration == 1.0){
            moviePrice += "8.99";
            message += moviePrice;
        }else if(movieDuration == 1.5){
            moviePrice += "10.50";
            message += moviePrice;
        }else if(movieDuration == 2.0){
            moviePrice += "12.99";
            message += moviePrice;
        }else if(movieDuration == 2.5){
            moviePrice += "14.50";
            message += moviePrice;
        }else if(movieDuration == 3 || movieDuration == 3.5 || movieDuration == 4){
            moviePrice += "15.99";
            message += moviePrice;
        }else {
            moviePrice = "Invalid duration";
            message += moviePrice;

        }

        System.out.println(message);

    }
}
