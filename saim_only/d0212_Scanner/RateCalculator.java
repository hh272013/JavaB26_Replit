package d0212_Scanner;
/*
Write a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)
 */
import java.util.Scanner;
public class RateCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter salary:");
        double salary = input.nextDouble();
        System.out.println("Hours worked per week:");
        int hours = input.nextInt();
        double hourlyRate = (salary/52)/hours;
        System.out.println("Hourly Rate: $"+hourlyRate);
        double payCheck = (salary/52)*2;
        System.out.println("Biweekly paycheck: $"+payCheck);
    }
}
