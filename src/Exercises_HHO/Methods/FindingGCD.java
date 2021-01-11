package Exercises_HHO.Methods;

import java.util.Scanner;

// 1. Find the Greatest common divisor(GCD) of two given numbers
// 2. Find the Least common multiple (LCM) of two given numbers
// 3. Check whether GCD(a,b) * LCM(a,b) = a*b with the help of a method.
public class FindingGCD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int number1 = scan.nextInt();

        System.out.print("Please enter the second number: ");
        int number2 = scan.nextInt();

        System.out.println("GCD of these two numbers is " + findGCD(number1,number2) + ".");
        System.out.println("LCM of these two numbers is " + findLCM(number1,number2) + ".");
        System.out.println("GCD(a,b) * LCM(a,b) = a*b rule is " + isTrue(number1,number2) + " here");

    }

    public static int findGCD (int number1, int number2){

        int gcd = 0;
        for (int i = 1; i <= number1 && i <= number2; i++){
            if(number1 % i == 0 && number2 % i == 0) gcd = i;
        }
        return gcd;
    }

    public static int findLCM(int number1, int number2){

        int lcm = 0;
        for (int i = number1 * number2; i >= number1 && i >= number2; i--){
            if(i % number1 == 0 && i % number2 == 0) lcm = i;
        }
        return lcm;
    }

    public static boolean isTrue (int number1, int number2){

        if(findGCD(number1, number2) * findLCM(number1, number2) == number1 * number2) return true;
        return false;
    }
}
