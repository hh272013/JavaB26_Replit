package d0221_Switch;
/*
Days In Month (slightly different version than before)
Write a program that will accept a month name and outputs how many days are in that month
data:
    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
 */

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of the month:");
        String monthEntered = input.nextLine();

        switch (monthEntered){

            case "January": case "january":
            case "March": case "march":
            case "May": case "may":
            case "July": case "july":
            case "August": case "august":
            case "October": case "october":
            case "December": case "december":
                System.out.println(monthEntered+" has 31 days");
                break;

            case "April": case "april":
            case "June": case "june":
            case "September": case "september":
            case "November": case "november":
                System.out.println(monthEntered+" has 30 days");
                break;

            case "February": case "february":
                System.out.println(monthEntered+" has 28 days");
                break;

            default:
                System.out.println(monthEntered+" is not a valid month");
        }


    }
}
