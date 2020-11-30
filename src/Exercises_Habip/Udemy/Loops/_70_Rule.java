package Exercises_Habip.Udemy.Loops;

import java.util.Scanner;

public class _70_Rule {
    public static void main(String[] args) {

        //Question: Calculate the number of years that is needed for a capital money to double itself with a given interest rate
        int year = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter capital amount: ");
        double capital = scan.nextDouble();

        System.out.print("Enter interest rate(percent): ");
        double interestRate = scan.nextDouble();

        while(year >= 0){

            if (capital * Math.pow((1 + (interestRate/100)), year) >= (2 * capital)) break;
            year++;

        }
        System.out.println("How many years needed for this capital to double its amount: " + year);
    }
}
