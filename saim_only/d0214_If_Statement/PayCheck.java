package d0214_If_Statement;
/*
create a double variable for your hourly rate
create a double variable for the number of hours worked
calculate your net pay, with consideration of overtime pay
	if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
		(if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
 */

import java.util.Scanner;
public class PayCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter hourly rate:");
        double hourlyRate = input.nextDouble();

        if (hourlyRate < 0){
            System.out.println("INVALID PAY RATE");
        } else {

            System.out.println("Total hours:");
            int totalHours = input.nextInt();
            if (totalHours < 0 || totalHours > 84){
                System.out.println("INVALID HOURS");
            }else {

                double payCheck = hourlyRate * 40;
                int overTime = totalHours - 40;
                double overTimeRate = overTime * (hourlyRate * 1.5);
                String payStub = "Total hours: " + totalHours;

                if (totalHours > 40) {
                    payCheck += overTimeRate;
                    payStub += "\n\tOvertime: " + overTime + " Hours" +
                            "\n\tOvertime Earned: $" + overTimeRate +
                            "\nTotal Pay: $" + payCheck;
                } else {
                    payStub += "\nTotal Pay: $" + payCheck;
                }

                System.out.println(payStub);
            }
        }
    }
}
