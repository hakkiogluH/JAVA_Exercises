package Exercises_HHO.Loops;

import java.util.Scanner;

public class NumberofDigits {
    public static void main(String[] args) {

        int len = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scan.nextLine();

        int numInt = Integer.parseInt(num);

        while (numInt > 0) {
            len += 1;
            numInt /= 10;
        }
        System.out.println("The number of digits in the number is " + len);
        scan.close();
    }
}
