package Exercises_Habip.Udemy.IfElse;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive number");
            if (num % 2 == 0) System.out.println("Even number");
            else System.out.println("Odd number");
        } else if (num < 0) {
            System.out.println("Negative number");
            if (num % 2 == 0) System.out.println("Even number");
            else System.out.println("Odd number");
        } else System.out.println("Zero");
        sc.close();
    }
}
