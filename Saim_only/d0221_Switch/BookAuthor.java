package d0221_Switch;
/*
You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.
Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.
Make variables for all of that information. Given empty defaults for all the variables

Data based on genre:

genre - Fantasy
page length - 500
profit - 1,000,000
sequels - 5
countries - 50

genre - Detective
page length - 350
profit - 700,000
sequels - 3
countries - 45

genre - Science Fiction
page length - 720
profit - 900,500
sequels - 4
countries - 30

genre - Short Story
page length - 150
profit - 300,000
sequels - 1
countries - 40
 */
import java.util.Scanner;

public class BookAuthor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter book's genre:");
        String genre = input.nextLine();

        String fantasy =
                "Genre - Fantasy\n" +
                "Page length - 500\n" +
                "Profit - 1,000,000\n" +
                "Sequels - 5\n" +
                "Countries - 50";

        String detective =
                "Genre - Detective \n" +
                "Page length - 350\n" +
                "Profit - 700,000\n" +
                "Sequels - 3\n" +
                "Countries - 45";

        String fiction =
                "Genre - Science Fiction\n" +
                "Page length - 720\n" +
                "Profit - 900,500\n" +
                "Sequels - 4\n" +
                "Countries - 30";

        String story =
                "Genre - Short Story\n" +
                "Page length - 150\n" +
                "Profit - 300,000\n" +
                "Sequels - 1\n" +
                "Countries - 40";

        switch (genre){
            case "Fantasy": case "fantasy":
                System.out.println(fantasy);
                break;
            case "Detective": case "detective":
                System.out.println(detective);
                break;
            case "Science Fiction": case "science fiction": case "fiction": case "Fiction":
                System.out.println(fiction);
                break;
            case "Short Story": case "short story": case "Short story": case "story": case "Story":
                System.out.println(story);
                break;
            default:
                System.out.println("Invalid Genre");
        }


    }
}
