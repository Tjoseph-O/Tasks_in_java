package chapterTwo;

import java.util.Scanner;

public class Arithmetic {

   /* (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
    the user and prints the square of each, the sum of their squares, and the difference of the squares
    (first number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
    */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the first number: ");
       int firstNumber = input.nextInt();

       System.out.println("Enter the secondNumber: ");
       int secondNumber = input.nextInt();

       int eachSquareOne = firstNumber * firstNumber;
       int eachSquareTwo = secondNumber * secondNumber;

       int squareSum = eachSquareOne + eachSquareTwo;

       int squareDifference = eachSquareOne - eachSquareTwo;

       System.out.printf("Square of each are %d%n%d%n", eachSquareOne, eachSquareTwo);

       System.out.printf("while the difference is: %d%n", squareDifference);



   }
}
