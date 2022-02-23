package d0207_Variables;
/*
create a class Pizza
add a main method
declare and assign these variables:
   type of pizza,  the number of slices,  the number of people eating
calculate how many slices each person will get
calculate how many slices are left over
Sample print statement:
   We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
 */
public class Pizza {
    public static void main(String[] args) {
        String pizzaType = "cheese pizza";
        int slices = 10;
        int people = 4;
        int slicesEach = slices / people;
        int leftOvers = slices % people;

        System.out.println("We ordered "+pizzaType+" with "+slices+" slices, "+people+" people ate "+slicesEach+" slices each with "+leftOvers+" left over");
    }
}
