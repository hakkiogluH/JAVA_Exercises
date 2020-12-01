package Exercises_HHO.Loops;

import java.util.Scanner;

public class NumberOfPrimeNumbers {
    public static void main(String[] args) {

        int n, count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of n: ");
        n = scanner.nextInt();

        int i = 2;
        while (count <= n) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + " ");
            }
            i++;
        }
        scanner.close();
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
