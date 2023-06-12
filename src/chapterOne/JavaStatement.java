package chapterOne;

import java.util.Scanner;

public class JavaStatement {


   /* Write Java statements that accomplish each of the following tasks:
    a) Display the message "Enter an integer: ", leaving the cursor on the same line.
            b) Assign the product of variables b and c to the int variable a.
            c) Use a comment to state that a program performs a sample payroll calculation.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int collectNum = input.nextInt();
        int b = 2;
        int c = 2;

        int a = b * c;

        System.out.println(a);



        // This program performs a sample payroll calculation





    }
}
