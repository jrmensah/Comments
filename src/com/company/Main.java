
/*Jerilyn Mensah
* October 11, 2017
* This application will prompt the user to enter a number to
* see if it is equal to the random number and will continue in a loop
* until the number and random number are equal.
 */

package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	//Set the value of the random number from 1 to 100
    Random random = new Random();
    long from = 1;
    long to = 100;
    int randomNumber;
        randomNumber = random.nextInt((int) ((to-from + 1) + from));
        //
    int guessedNumber = 0;

    //The random number is between 1 and 100.
        System.out.printf("The number is between %d and %d. \n", from,to);

    //Ask the user to enter a number to see if it is too high,
    //too low or if it is equal to the random number.
    do
    {
        System.out.print("Guess what the number is:");
        guessedNumber = scan.nextInt();
        if (guessedNumber > randomNumber)
            System.out.println("Your guess is too high!");
        else if (guessedNumber < randomNumber)
            System.out.println("Your guess is too low!");
        else
            System.out.println("You got it!");
    }while (guessedNumber !=randomNumber);


    }
}
