package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallest {

    /*(Largest and Smallest Integers) Write an application that reads five integers and determines
    and prints the largest and smallest integers in the group. Use only the programming techniques you
    learned in this chapter

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter an Integer: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter an Integer: ");
        int thirdNumber = input.nextInt();

        System.out.println("Enter an Integer: ");
        int fourthNumber = input.nextInt();

        System.out.println("Enter an Integer: ");
        int fifthNumber = input.nextInt();

        int largestNumber = firstNumber;
        int smallestNumber = firstNumber;


        if (secondNumber > largestNumber) largestNumber = secondNumber;
        if (thirdNumber > largestNumber) largestNumber = thirdNumber;
        if (fourthNumber > largestNumber) largestNumber = fourthNumber;
        if (fifthNumber > largestNumber) largestNumber = fifthNumber;

        if (secondNumber < smallestNumber) smallestNumber = secondNumber;
        if (thirdNumber < smallestNumber) smallestNumber = thirdNumber;
        if (fourthNumber < smallestNumber) smallestNumber = fourthNumber;
        if (fifthNumber < smallestNumber) smallestNumber = fifthNumber;


        System.out.printf("The smallest number and the largest number are: %d%n%d%n", smallestNumber, largestNumber);





    }
}
