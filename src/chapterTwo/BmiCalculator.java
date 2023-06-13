package chapterTwo;

import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms: ");
        int weight = input.nextInt();

        System.out.println("Enter your height in meters: ");
        double height = input.nextDouble();

        double bmi = (height * height) / weight;

        System.out.println(bmi);



    }
}
