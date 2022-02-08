package Assignment_02_07;
/*
Use the given information to create and print out the information of an employee
Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)
first name: Noah
last name: Smith
company name: Apple
salary: 200,000
start day: 10
start month: 1
start year: 2022
full time: true
job title: SDET
office address: One Apple Park Way, Cupertino, CA 95014
Declare these new variables using the values of the previous variables
full name: (first and last name)
full start date: (start month date, year)
email: (first name + start day @ company name .com)
salary after 2 years (base salary * 15 %)
Display all the information in the following format using the variables created up to this point:
Employee Information
We have FULL_NAME joining COMPANY_NAME
FIRST_NAME will start on FULL_START_DATE as full time: IS_FULL_TIME
FIRST_NAME here is some information about your employment
Your email is EMAIL
Your base salary is $SALARY and after 2 years it will be $SALARY_2_YEARS
Welcome aboard, see you at ADDRESS
Employee Information
We have FULL_NAME joining COMPANY_NAME
FIRST_NAME will start on FULL_START_DATE as full time: IS_FULL_TIME
FIRST_NAME here is some information about your employment
Your email is EMAIL
Your base salary is $SALARY and after 2 years it will be $SALARY_2_YEARS
Welcome aboard, see you at ADDRESS
Note: Variables should be used to construct the message otherwise it will be hardcoded information

Main topics: variables, primitive datatypes, concatenation, operators
 */

public class Employee {
    public static void main(String[] args) {
        String firstName = "Noah";
        String lastName = "Smith";
        String companyName = "Apple";
        int salary = 200_000;
        String startDay = "10";
        String startMonth = "1";
        String startYear = "2022";
        boolean isFullTime = true;
        String jobTitle = "SDET";
        String officeAddress = "One Apple Park Way, Cupertino, CA 95014";

        // Declaring new variable from given variables:
        String fullName = firstName+" "+lastName;
        String startDate = startMonth+"/"+startDay+"/"+startYear;
        String email = firstName+startDay+"@"+companyName+".com";
        int salaryAfter2years = salary + (salary * 15/100) ;

        // Printing employee details:
        System.out.println("Employee Information");
        System.out.println("We have "+fullName+" joining "+companyName);
        System.out.println(firstName+" will start on "+startDate+" as full time: "+isFullTime);
        System.out.println(firstName+" here is some information about your employment");
        System.out.println("Your email is "+email);
        System.out.println("Your base salary is $"+salary+" and after 2 years it will be $"+salaryAfter2years);
        System.out.println("Welcome aboard, see you at "+officeAddress);

    }
}
