package Exercises_Habip.Udemy.Loops;

import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String[] args) {

        int n, count = 0;
        int i = 2;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = scan.nextInt();

        while (count <= n) {
            if (isPrime(i)) {
                count++;
                if (count == n) System.out.println("The " + n + "th prime number is " + i);
            }
            i++;
        }
        scan.close();
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
