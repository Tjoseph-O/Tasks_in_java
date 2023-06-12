package chapterOne;

import java.util.Scanner;

public class ComparingIntegers {

    /*(Comparing Integers) Write an application that asks the user to enter one integer, obtains
    it from the user and displays whether the number and its square are greater than, equal to, not equal
    to, or less than the number 100. Use the techniques shown in Fig. 2.15.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        int square = number * number;

        if(number > 100){
            System.out.println("Your number is greater than 100");

        } else
            System.out.println("Your number is less than 100");

        if (square > 100) {
            System.out.println("Square greater than 100");

        }else System.out.println("Square less than 100");

        if (number == 100) {
            System.out.println("Number equal to 100");

        }else System.out.println("Number not equal to 100");

        if (square == 100) {
            System.out.println("square Equal to 100");

        }else System.out.println("Square Not equal to 100");

        if (number != 100) {
            System.out.println("Number is not equal 100");

        }else System.out.println("Number less than 100");

        if (square != 100) {
            System.out.println("Square not equals to 100");

        }else System.out.println("Square equals to  100");

        if (number < 100) {
            System.out.println("Number less than 100");

        }else System.out.println("Number greater than 100");

        if (square < 100) {
            System.out.println("Square less than 100");

        }else System.out.println("Square more than 100");


    }
}
