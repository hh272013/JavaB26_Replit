package Assignment_02_20;
/*
Create a program that will build a custom computer by selecting each part and computing the total price.
Use the following requirements for each section:

First ask the user about the screen size
Select screen size:
    For a screen size of 13.3, add $200 to the total price
    For a screen size of 15.0, add 300 to the total price
    For screen size of 17.3, add $400 to the total price

Then ask the user about the CPU
Select CPU type:
    For a CPU of i3, add $150 to the total price
    For a CPU of i5, add $250 to the total price
    For a CPU of i7, add $350 to the total price

Then ask the user about the RAM size
Select RAM size:
    Add $50 to the total price for every 4GB of ram.
    Assume the ram amounts will be divisible by 4

Then ask the user about the storage type and amount
Select storage type:
Select storage size:
For HDD, add $50 to the total price for every 500GB
For SSD, add $100 to the total price for every 500GB

Then ask the user about the screen resolution
Select screen resolution:
    For FULLHD, add $100 to the total price
    For 4K, add $200 to the total price

At the end display the total price of the custom computer
Laptop price is: $amount

Main topics:
conditional statements, primitive variables, operators, Scanner

Example Flows:
  Select screen size:
    13.3
  Select CPU type:
    i7
  Select RAM size:
    8
  Select storage type:
    SSD
  Select storage size:
    1000
  Select screen resolution:
    4K
  Final price is: $1050.0

  Select screen size:
    13.3
  Select CPU type:
    i3
  Select RAM size:
    4
  Select storage type:
    HHD
  Select storage size:
    500
  Select screen resolution:
    FULLHD
  Final price is: $550.0
 */
import java.util.Scanner;
public class ComputerBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double finalPrice = 0;

        System.out.println("Select screen size:");
        String size = input.nextLine();
        switch (size){
            case "13.3":
                finalPrice += 200;
                break;
            case "15.0":
                finalPrice += 300;
                break;
            case "17.3":
                finalPrice += 400;
                break;
        }

        System.out.println("Select CPU type:");
        String cpuType = input.nextLine();
        switch (cpuType){
            case "i3":
                finalPrice += 150;
                break;
            case "i5":
                finalPrice += 250;
                break;
            case "i7":
                finalPrice += 350;
                break;
        }

        System.out.println("Select RAM size:");
        String ramSize = input.nextLine();
        switch (ramSize){
            case "4":
                finalPrice += 50;
                break;
            case "8":
                finalPrice += 100;
                break;
            case "12":
                finalPrice += 150;
                break;
            case "16":
                finalPrice += 200;
                break;
            case "20":
                finalPrice += 250;
                break;
            case "24":
                finalPrice += 300;
                break;
            case "28":
                finalPrice += 350;
                break;
            case "32":
                finalPrice += 400;
                break;
            case "64":
                finalPrice += 800;
                break;
        }

        System.out.println("Select storage type:");
        String storageType = input.nextLine();
        double increase = 0;
        switch (storageType){
            case "HDD": case "hdd":
                increase += 50;
                break;
            case "SSD": case "ssd":
                increase += 100;
                break;
        }

        System.out.println("Select storage size:");
        String storageSize = input.nextLine();
        switch (storageSize){
            case "500":
                finalPrice += increase;
                break;
            case "1000":
                finalPrice += increase * 2;
                break;
            case "1500":
                finalPrice += increase * 3;
                break;
            case "2000":
                finalPrice += increase * 4;
                break;
        }

        System.out.println("Select screen resolution:");
        String resolution = input.nextLine();
        switch (resolution){
            case "FULLHD": case "fullhd": case "FullHD":
                finalPrice += 100;
                break;
            case "4K": case "4k":
                finalPrice += 200;
                break;
        }

        System.out.println("Final price is: $"+finalPrice);

    }
}