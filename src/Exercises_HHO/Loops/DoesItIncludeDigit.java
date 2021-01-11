package Exercises_HHO.Loops;

import java.util.Scanner;

public class DoesItIncludeDigit {
    public static void main(String[] args) {

        boolean flag = true;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();


        System.out.print("Enter the digit to be searched: ");
        int key = scan.nextInt();

        while (number > 0) {
            int rem = number % 10;
            if (rem == key) {
                System.out.println("Yes, the " + key + " exists in this number");
                flag = false;
                break;
            }
            number /= 10;
        }
        if (flag) System.out.println(key + " not found");
    }
}
