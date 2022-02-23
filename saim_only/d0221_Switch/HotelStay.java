package d0221_Switch;
/*
Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their party (how many people are staying in the room)
Use those two information to determine the price and room type for the hotel based on the below data:

party size: 1
room type: single room
price: number of days * 100

party size: 2
room type: double room
price: number of days * 125

party size: 3 or 4
room type: large room
price: number of days * number of people * 150

party size: 5, 6, or 7
room type: suite
price: number of days * 5000

	any other party size:
		Display one message:
			Sorry we don't have any available rooms for that size party
 */

import java.util.Scanner;
public class HotelStay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many days will you stay?");
        int numberOfDays = input.nextInt();

        System.out.println("How many people will be staying?");
        int numberOfPeople = input.nextInt();

        String invalidEntry = "Sorry we don't have any available rooms";

        if (numberOfPeople > 0 && numberOfPeople < 7) {
            System.out.println("Do you want:\nsingle room, double room, large room, or suite?");
            String roomType = input.next();

            int roomPrice;

            String message = "Party size: " + numberOfPeople +
                    "\nRoom type: " + roomType;

            switch (roomType) {

                case "single":
                case "Single":
                    roomPrice = numberOfDays * 100;
                    message += "\nPrice: " + roomPrice;
                    System.out.println(message);
                    break;

                case "double":
                case "Double":
                    roomPrice = numberOfDays * 125;
                    message += "\nPrice: " + roomPrice;
                    System.out.println(message);
                    break;

                case "large":
                case "Large":
                    roomPrice = numberOfDays * 150;
                    message += "\nPrice: " + roomPrice;
                    System.out.println(message);
                    break;

                case "suite":
                case "Suite":
                    roomPrice = numberOfDays * 5000;
                    message += "\nPrice: " + roomPrice;
                    System.out.println(message);
                    break;

                default:
                    invalidEntry += " of that room type";
                    System.out.println(invalidEntry);
            }
        } else {
            invalidEntry += " for that many people";
            System.out.println(invalidEntry);
        }
    }
}

