package assignment_02_07;
/*
Given two cities, miles between the cities, and a base ticket price, and rate calculate the ticket price.
Formula for price: base price + miles between cities / rate
Display the details in the following format:
	The ticket price from Chicago to Virginia is $dollarAmount
	The ticket price from Chicago to Virginia is $dollarAmount
Ex:
	city 1 -> Chicago
	city 2 -> Virginia
	base ticket price -> 110.50
	miles between cities -> 739.8
  rate: 10
  ​
  Output:
    The ticket price from Chicago to Virginia is $184.48
	city 1 -> Chicago
	city 2 -> Virginia
	base ticket price -> 110.50
	miles between cities -> 739.8
  rate: 10

  Output:
    The ticket price from Chicago to Virginia is $184.48
Main topics: variables, primitive datatypes, operators
 */
public class Plane_Ticket {
    public static void main(String[] args){

        //DO NOT TOUCH THESE LINE/LINES.
        String cityOne = "Chicago";
        String cityTwo = "Virginia";
        double basePrice = 152.40;
        double milesBetweenCities = 739.8;
        double rate = 3;

        //WRITE YOUR CODE BELOW:
        double dollarAmount = basePrice + milesBetweenCities / rate;
        System.out.println("The ticket price from "+cityOne+" to "+cityTwo+" is $"+dollarAmount);
    }
}
