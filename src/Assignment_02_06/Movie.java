package Assignment_02_06;

public class Movie {
    /*
    A new movie is being screened and the information is being displayed. Declare and assign the following variables to complete the information:
Declare a String variable named movieName and assign Spider-Man as the value
Declare a String variable named releaseDate and assign 12/17/2021 as the value
Declare a String variable named genre and assign Action/Adventure as the value
Declare a int variable named rottenTomatoesRating and assign 97 as the value
Declare a String variable named rating and assign PG-13 as the value
Declare a double variable named duration and assign 2.5 as the value
Declare a boolean variable named isSequel and assign true as the value
Declare a boolean variable named isOnDvd and assign false as the value
Note: The only thing you need to do is create and assign the variables, you should not write any print statements.
Main topics: variables, primitive datatypes, concatenation
     */
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW:
        String movieName = "Spider-Man";
        String releaseDate = "12/17/2021";
        String genre = "Action/Adventure";
        int rottenTomatoesRating = 97;
        String rating = "PG-13";
        double duration = 2.5;
        boolean isSequel = true;
        boolean isOnDvd = false;
        //DO NOT TOUCH THESE LINE/LINES.
        System.out.println("------ Welcome to the Cinema ------");
        System.out.println("Tonight we are streaming " + movieName + " which was released on " + releaseDate + ".");
        System.out.println("This " + genre + " movie got a " + rottenTomatoesRating + " rating on Rotten Tomatoes.");
        System.out.println("The rating is " + rating  + " and it runs for " + duration + " hours.");
        System.out.println("This is a sequel " + isSequel + " and is on dvd " + isOnDvd + ".");

    }
}
