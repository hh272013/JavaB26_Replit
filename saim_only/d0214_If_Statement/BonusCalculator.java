package d0214_If_Statement;
/*
create a sales amount variable
use the sales amount to determine the bonus you get at end of the month
	if your sales amount is less than 10000 you don't get any bonus
	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000
	if your sales amount is more than or equal to 15000 you get a bonus of 7000
	print your bonus number
 */
import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sales amount");
        double sales = input.nextDouble();

        if(sales >= 10000 && sales < 15000){
            System.out.println("Bonus Earned = $5000");
            sales += 5000;
            System.out.println("Total Earnings = $"+sales);
        }else if(sales >= 15000){
            System.out.println("Bonus Earned = $7000");
            sales += 7000;
            System.out.println("Total Earnings = $"+sales);
        }else if(sales < 10000 && sales > 0){
            System.out.println("No bonus earned");
        }else {
            System.out.println("INVALID ENTRY");
        }
    }
}
