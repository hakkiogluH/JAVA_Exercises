package Exercises_Habip.Udemy.Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int temp = num;

        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("The sum of all digits of " + temp + " is " + sum);
        scanner.close();
    }
}
