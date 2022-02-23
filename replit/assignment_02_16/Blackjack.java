package assignment_02_16;
/*
Use if statements to help the Blackjack dealer determine who won. There will be an int house value and an int player value. Use the following rules of blackjack to print out the result:
if the player score is bigger than 21, the result is player bust
if the player score is equal to the house score, the result is its a tie
if the player score is equal to 21, the result is player win
if the house score is bigger than the player score, the result is player lose
if the player score is bigger than the house score, the result is player win
Note: Can be done with separate if statement or a multi branch if statement
Main topics: if statements, primitive variables, operators

Ex:
  Input:
    8
    21
  Output:
    player win

Ex:
  Input:
    10
    7
  Output:
    player lose
Ex:
  Input:
    4
    4
  Output:
    its a tie

Ex:
  Input:
    10
    25
  Output:
    player bust

Ex:
  Input:
    7
    12
  Output:
    player win
 */

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        //WRITE YOUR CODE BELOW
        boolean playerBusted = player > 21;
        boolean itsTie = player == house;
        boolean playerWin = player == 21 || player > house;

        if(playerBusted){
            System.out.println("player bust");
        }else if(itsTie){
            System.out.println("its a tie");
        }else if(playerWin){
            System.out.println("player win");
        }else {
            System.out.println("player lose");
        }






    }
}
