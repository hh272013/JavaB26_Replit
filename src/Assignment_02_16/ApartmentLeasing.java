package Assignment_02_16;
/*
Use if statements to find the cost of leasing an apartment based on the number of bedrooms. Use the numberOfBedrooms variable and these rates to get the final price:
1 bedroom: 1100
2 bedroom: 1850
3 bedroom: 2550
Note: If an invalid bedroom number is given no price is displayed
Note: Can use multiple if statements or a multi branch if statement
Main topics: if statements, primitive variables, concatenation, operators

Example Flows:
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
1
One Bedroom Selected
Starting Price: 1100
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?

3
Three Bedroom Selected
Starting Price: 2550
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
5
Sorry, we do not offer that many bedrooms
 */

import java.util.Scanner;
public class ApartmentLeasing {
    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");
        int numberOfBedrooms = scan.nextInt();

        //WRITE YOUR CODE HERE:
        String oneBed = "One Bedroom Selected"+
                      "\nStarting Price: 1100";

        String twoBed = "Two Bedroom Selected"+
                      "\nStarting Price: 1850";

        String threeBed = "Three Bedroom Selected"+
                        "\nStarting Price: 2550";

        if(numberOfBedrooms == 1){
            System.out.println(oneBed);
        }else if(numberOfBedrooms == 2){
            System.out.println(twoBed);
        }else if(numberOfBedrooms == 3){
            System.out.println(threeBed);
        }else {
            System.out.println("Sorry, we do not offer that many bedrooms");
        }


    }
}
