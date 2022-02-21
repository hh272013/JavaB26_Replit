package Assignment_02_20;
/*
Android is one of the popular mobile operating systems. The versions in android systems follow names related to sweets. You will need to take the given version value to output the name of the current version. Use the follow chart to determine the versions:
Note: The version will be given as a String
Versions

1.5 - Cupcake
1.6 - Donut
2.1 - Eclair
2.2 - Froyo
2.3 - Gingerbread
3.1 - Honeycomb
4.0 - Ice Cream Sandwich
4.1 - Jelly Bean
4.4 - KitKat
5.0 - Lollipop
8.0 - Oreo
9.0 - Pie
Any other number is invalid and should display: Not a valid version
Note: Its possible to use if statements to complete this, but use switch statement for practice. Or for even more practice, complete the task twice, once using each different conditional statement.
Main topics: switch statements, primitive variables, Scanner

Examples:
Ex:
  Input:
    1.5
  Output:
    Cupcake
Ex:
  Input:
    0.9
  Output:
    Pie
Ex:
  Input:
    11.0
  Output:
    Not a valid version
 */

import java.util.Scanner;
public class AndroidVersions {
    public static void main(String[] args){
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String version = input.nextLine();

        //WRITE YOUR CODE BELOW:
        String verionName;

        switch (version){
            case "1.5":
                verionName = "Cupcake";
                break;
            case "1.6":
                verionName = "Donut";
                break;
            case "2.1":
                verionName = "Eclair";
                break;
            case "2.2":
                verionName = "Froyo";
                break;
            case "2.3":
                verionName = "Gingerbread";
                break;
            case "3.1":
                verionName = "Honeycomb";
                break;
            case "4.0":
                verionName = "Ice Cream Sandwich";
                break;
            case "4.1":
                verionName = "Jelly Bean";
                break;
            case "4.4":
                verionName = "KitKat";
                break;
            case "5.0":
                verionName = "Lollipop";
                break;
            case "8.0":
                verionName = "Oreo";
                break;
            case "9.0":
                verionName = "Pie";
                break;
            default:
                verionName = "Not a valid version";
        }

        System.out.println(verionName);

    }
}
