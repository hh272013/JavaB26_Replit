package Assignment_02_07;
/*
We will calculate someones age based on the current year and the birth year
Given two int variables currentYear and birthYear calculate and print out the age in the following format:
Your age is $age
Ex:
  ​
  if currentYear is 2014
  and birthYear is 2000
  ​
  Your age is 14
Ex:
  if currentYear is 2014
  and birthYear is 2000
  Your age is 14
Main topics: variables, primitive datatypes, operators
 */
public class Calculate_Age {
    public static void main(String[] args){
        //DO NOT TOUCH THESE LINE/LINES.
        int currentYear = 2022;
        int birthYear = 1984;

        //WRITE YOUR CODE BELOW:
        int currentAge = currentYear - birthYear;
        System.out.println("Your age is "+currentAge);
    }
}
