package d0221_Switch;
/*
declare and assign a floor number variable.
The floor number represent which floor you want the elevator to go to.
After getting to each floor show the information of which companies are on that floor.
Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected
 */
import java.util.Scanner;
public class Elevator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter floor number:");

        int floorNumber = input.nextInt();

       switch (floorNumber){
           case 1:
               System.out.println("Lobby, StarBucks, Amazon Pick Up");
           case 2:
               System.out.println("NASA, Cydeo, Discover");
           case 3:
               System.out.println("Uber, Lyft, Chase");
           case 4:
               System.out.println("Rooftop, Lounge");
           default:
               System.out.println("Invalid Floor Selected");
       }

    }
}
