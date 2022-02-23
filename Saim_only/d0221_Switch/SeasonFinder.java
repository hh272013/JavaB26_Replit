package d0221_Switch;
/*
declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month
	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall
Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat
 */

import java.util.Scanner;
public class SeasonFinder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String winter = "It's winter, so wear winter-coat, gloves, and hat";
        String spring = "It's spring, so wear cotton shirt";
        String summer = "It's summer, so wear a T-shirt and a cap";
        String fall = "It's fall, so wear a jacket";
        String invalid = "Invalid month number, enter between 1 and 12";

        System.out.println("Enter the month number:");
        int monthNumber = scan.nextInt();

        switch (monthNumber){
            case 1: case 2: case 12:
                System.out.println(winter);
                break;
            case 3: case 4: case 5:
                System.out.println(spring);
                break;
            case 6: case 7: case 8:
                System.out.println(summer);
                break;
            case 9: case 10: case 11:
                System.out.println(fall);
                break;
            default:
                System.out.println(invalid);
        }

    }
}
