package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
  /*  (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
    user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
    shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
    representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]
   */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter the number: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter the number: ");
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;

        int average = sum / 3;

        System.out.println(sum);

        System.out.println(average);


    }
}
