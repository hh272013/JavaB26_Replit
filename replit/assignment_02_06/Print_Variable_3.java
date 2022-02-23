package assignment_02_06;
/*
Five friends are going to the theater. They have purchased a row of five seats with an aisle on either end.
5 String variables are already declared with their names. These are the preferences of where the friends want to sit:
James doesn't want to sit next to Jill
Betty and Herb are dating and want to sit next to each other
Bob wants to sit on the left side aisle
James wants to sit an aisle seat
Construct and print the seating order following the friends' preferences. Separate the names with commas and a space
Hint: Use the name variables and concatenation
Main topics: print statement, variables, concatenation, problem solving
An example of an invalid seating order is:
James, Betty, Herb, Bob, Jill
The above arrangement is invalid because: Bob is not sitting on left aisle.
 */
public class Print_Variable_3 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES.
        String p1 = "James";
        String p2 = "Jill";
        String p3 = "Bob";
        String p4 = "Betty";
        String p5 = "Herb";

        //WRITE YOUR CODE BELOW:
        //Bob, Jill, Betty, Herb, James
        System.out.println(p3+", "+p2+", "+p4+", "+p5+", "+p1);

    }

}
