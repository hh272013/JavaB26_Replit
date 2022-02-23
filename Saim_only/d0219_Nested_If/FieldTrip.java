package d0219_Nested_If;
/*
Create a class called FieldTrip.
Your school goes on a Field trip each year. The place you go will be based on your grade. Based on the grade level (1-6) figure out the details of your field trip. Print the information at the end.

declare and assign the grade level variable

	only check for the data for valid grades which are only grades values from 1-6. Less than 1 and more than 6 is invalid,
		so print: "Grade must be between 1-6"

    Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */
import java.util.Scanner;
public class FieldTrip {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String details_grade1 =
                "Grade - 1\n" +
                "Location -  Apple orchard\n" +
                "Number of groups - 3\n" +
                "Teacher in charge - Ms. Smith";

        String details_grade2 =
                "Grade - 2\n" +
                "Location - Zoo\n" +
                "Number of groups - 7\n" +
                "Teacher in charge - Mr. Lee";

        String details_grade3 =
                "Grade - 3\n" +
                "Location - Aquarium\n" +
                "Number of groups - 5\n" +
                "Teacher in charge - Ms. Wilson";

        String details_grade4 =
                "Grade - 4\n" +
                "Location - Movie theater\n" +
                "Number of groups - 2\n" +
                "Teacher in charge - Ms. Reyes";

        String details_grade5 =
                "Grade - 5\n" +
                "Location - Museum\n" +
                "Number of groups - 5\n" +
                "Teacher in charge - Ms. Lela";

        String details_grade6 =
                "Grade - 6\n" +
                "Location - Six Flags\n" +
                "Number of groups - 8\n" +
                "Teacher in charge - Mr. Watt";

        String details_invalid =
                "Grade must be between 1 and 6";

        System.out.println("Enter grade:");
        int grade = input.nextInt();

        if(grade >= 1 && grade <= 6){
            if(grade == 1){
                System.out.println(details_grade1);
            }else if(grade == 2){
                System.out.println(details_grade2);
            }else if (grade == 3){
                System.out.println(details_grade3);
            }else if (grade == 4){
                System.out.println(details_grade4);
            }else if(grade == 5){
                System.out.println(details_grade5);
            }else {
                System.out.println(details_grade6);
            }
        }else {
            if(grade < 0){
                details_invalid += "\nYou have entered a negative number";
            }else if(grade > 6){
                details_invalid += "\nYou have entered more than 6";
            }else {
                details_invalid += "\nYou have entered zero";
            }
            System.out.println(details_invalid);
        }



    }
}
