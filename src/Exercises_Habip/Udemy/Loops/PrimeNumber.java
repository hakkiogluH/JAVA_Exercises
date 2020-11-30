package Exercises_Habip.Udemy.Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int num;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) flag = false;
        }
        if (flag) System.out.println("It is a prime number");
        else System.out.println("It is not a prime number");
        sc.close();
    }
}
