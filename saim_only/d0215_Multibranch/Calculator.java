package d0215_Multibranch;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter operator:");
        String operator = input.next();
        char operate = operator.charAt(0);

        System.out.println("Enter second number:");
        double num2 = input.nextDouble();

        double equals = 0;



        if(operate == '+'){
            equals = num1 + num2;
        }else if(operate == '-'){
            equals = num1 - num2;
        }else if(operate == '*'){
            equals = num1 * num2;
        }else if(operate == '/'){
            equals = num1 / num2;
        }else {
            System.out.println("invalid operator");
        }
        String result = ""+num1+" "+operate+" "+num2+" = "+equals;
        System.out.println(result);
    }
}
