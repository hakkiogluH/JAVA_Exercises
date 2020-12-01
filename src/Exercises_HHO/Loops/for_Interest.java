package Exercises_HHO.Loops;

import java.util.Scanner;

public class for_Interest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our bank. Our interest rate is 5% per year.");

        int capital, duration;

        System.out.print("Amount you want to deposit (in Euros): ");
        capital = scanner.nextInt();
        System.out.print("Intended duration (in years): ");
        duration = scanner.nextInt();

        int totalMoney = capital;
        double interestRate = 0.05;

        for(int i = 1; i<=duration; i++){
            totalMoney *=(1 + interestRate);
            System.out.println("Total money after " + i + " years = " + totalMoney + " Euro.");
        }
    }
}
