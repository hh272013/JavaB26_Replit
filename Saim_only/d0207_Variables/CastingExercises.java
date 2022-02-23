package d0207_Variables;
/*
declare and assign a short variable
declare and assign a byte variable with the short value above. Cast if needed

declare and assign a float variable
declare and assign a double variable with the float value above. Cast if needed

declare and assign a double variable
declare and assign a int variable with the double value above. Cast if needed

declare and assign a long variable
declare and assign a int variable with the long value above. Cast if needed
 */
public class CastingExercises {
    public static void main(String[] args) {
        short myShortValue = 27;
        byte byteFromShort = (byte) myShortValue;
        System.out.println("Explicit casting from short to byte = "+byteFromShort);

        float myFloatValue = 28;
        double doubleFromFloat = myFloatValue;
        System.out.println("Implicit casting from float to double = "+doubleFromFloat);

        double myDoubleValue = 29;
        int intFromDouble = (int)myDoubleValue;
        System.out.println("Explicit casting from double to int = "+intFromDouble);

        long myLongValue = 30;
        int intFromLong = (int)myLongValue;
        System.out.println("Explicit casting from long to int = "+intFromLong);
    }
}
