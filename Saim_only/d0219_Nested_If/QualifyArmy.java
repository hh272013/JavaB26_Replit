package d0219_Nested_If;

import java.util.Scanner;

/*
Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

	- The person must be a citizen or a resident
		-> If not print: You must be a citizen or a resident
	- Their age must be between 18 and 35
		-> If not print: Your age must be between 18 to 35 years old
	- They must have a high school diploma
		-> If not print: You must have a high school diploma

	> If all the criteria is met print: You are qualified for the Army

 */
public class QualifyArmy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        if(age >= 18 && age <= 35){
            System.out.println("Enter true or false for the following:");

            System.out.println("Are you a US citizen or a resident?");
            boolean isCitizen = input.nextBoolean();

                if(isCitizen){
                    System.out.println("Do you have a High School diploma?");
                    boolean isHighSchoolGrad = input.nextBoolean();

                    if (isHighSchoolGrad){
                        System.out.println("You are qualified for the Army");
                    }else {
                        System.out.println("You only need a High School diploma to qualify for the Army");
                    }

                }else {
                    System.out.println("You must be a US citizen or permanent resident to qualify for the Army");
                }

        }else {
            System.out.println("You must be between the age of 18 and 35 to qualify for the Army");
        }




    }
}
