package d0214_If_Statement;
/*
create a int variable to represent the month number, where 1 is Janurary and 12 is Decemeber.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each month:

	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
	Months that has 30 days: 4, 6, 9, 11
	Month that has 28 days: 2

	ex:
		12
		31 days

	ex:
		9
		30 days
 */
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month in number format");
        int month = input.nextInt();

        if(month <= 0 || month > 12){
            System.out.println("Invalid entry");
        }else {
            switch (month){
                case 1:
                    System.out.println("There are 31 days in January");
                    break;
                case 2:
                    System.out.println("There are 29 days in February");
                    break;
                case 3:
                    System.out.println("There are 31 days in March");
                    break;
                case 4:
                    System.out.println("There are 30 days in April");
                    break;
                case 5:
                    System.out.println("There are 31 days in May");
                    break;
                case 6:
                    System.out.println("There are 30 days in June");
                    break;
                case 7:
                    System.out.println("There are 31 days in July");
                    break;
                case 8:
                    System.out.println("There are 31 days in August");
                    break;
                case 9:
                    System.out.println("There are 30 days in September");
                    break;
                case 10:
                    System.out.println("There are 31 days in October");
                    break;
                case 11:
                    System.out.println("There are 30 days in November");
                    break;
                case 12:
                    System.out.println("There are 31 days in December");
                    break;
            }

        }


    }
}
