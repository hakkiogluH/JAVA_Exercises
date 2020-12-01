package Exercises_HHO.Loops;

import java.util.Scanner;

public class SecondMaxNumber {
    public static void main(String[] args) {

        int n, temp, max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of inputs: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            temp = sc.nextInt();

            if (temp >= max) {
                secondMax = max;
                max = temp;
            }
            else if (temp >= secondMax) secondMax = temp;
        }

        System.out.println("The greatest number is " + max);
        System.out.println("The second greatest number is " + secondMax);
        sc.close();
    }
}
