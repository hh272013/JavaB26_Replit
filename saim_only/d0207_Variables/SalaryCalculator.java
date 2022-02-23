package d0207_Variables;
/*
create a class SalaryCalculator
add a main method
declare and assign these variables:
   salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
Sample date:
   100000 (salary)
   0.08 (state tax rate)
   0.21 (federal tax rate)
Hint: use tax rates of 0.08 and 0.21 for 8% and 21%
Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 100000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double totalTax = (salary * stateTaxRate) + (salary * federalTaxRate);
        int stateTax = (int)(stateTaxRate * 100);
        int federalTax = (int)(federalTaxRate * 100);
        double salaryAfterTax = salary - totalTax;

        System.out.println("Total salary: $"+salary+"\nState tax: "+stateTax+"%\nFederal tax: "+federalTax+"%\nTotal tax: $"+totalTax+"\nSalary after tax: $"+salaryAfterTax);
    }
}
