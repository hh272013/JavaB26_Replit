package d0207_Variables;
/*
create a class AverageScore
add a main method
declare and assign these variables:
   four score values
calcualte the average score using the given four score values

Ex:
   90, 80, 100, 95
   Print:
      Average: 91.25
 */
public class AverageScore {
    public static void main(String[] args) {
        double score01 = 90;
        double score02 = 80;
        double score03 = 100;
        double score04 = 95;
        double values = 4;

        double averageScore = (score01 + score02 + score03 + score04) / values;
        System.out.println("Average: "+averageScore);
    }
}
