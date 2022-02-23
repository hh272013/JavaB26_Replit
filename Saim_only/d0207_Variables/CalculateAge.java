package d0207_Variables;
/*
create a class CalculateAge
add a main method
declare and assign these variables:
   current year, year you were born
calculate your age from the two variables.

Print: I'm $years old
 */
public class CalculateAge {
    public static void main(String[] args){

        int currentYear = 2022;
        int birthYear = 1981;
        int age = currentYear - birthYear;

        System.out.println("I'm "+age+" years old");
    }
}
