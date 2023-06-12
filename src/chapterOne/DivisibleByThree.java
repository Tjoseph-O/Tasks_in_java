package chapterOne;

import java.util.Scanner;

public class DivisibleByThree {

   /* (Divisible by 3) Write an application that reads an integer and determines and prints
    whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
    it’s divided by 3 with a remainder of 0.]

    */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter an integer: ");
       int number = input.nextInt();

       if (number % 3 == 0) System.out.println("Divisible by 3");else System.out.println("not");
   }
}
