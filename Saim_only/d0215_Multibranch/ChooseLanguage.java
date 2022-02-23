package d0215_Multibranch;
/*
create a class ChooseLanguage

ask the user to enter a number based on the language they wanted to use.
	1 - English
	2 - Spanish
	3 - Turkish
	4 - Russian
	5 - French

based on the number they picked print a message:

	1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
 */
import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number based on the language you want to use:"+
                "\n\t1 - English"+
                "\n\t2 - Spanish"+
                "\n\t3 - Turkish"+
                "\n\t4 - Russian"+
                "\n\t5 - French");

        String message = "";

        int selection = input.nextInt();
        switch (selection){
            case 1:
                message = "hello, thank for your call";
                break;
            case 2:
                message = "hola, gracias para llamar";
                break;
            case 3:
                message = "merhaba, aradiginiz icin tesekkurler";
                break;
            case 4:
                message = "privet, spasibo za vash zvonok";
                break;
            case 5:
                message = "Merci ,pour votre appel";
                break;
            default:
                message = "We will use English by default";
        }

        System.out.println(message);
    }
}
