package Exercises_HHO.Methods;

// 1000'e kadar olan tamsayılardan asal olanları ekrana yazdırınız.(Print prime numbers between 0 and 1000)
// İkinci olarak bu sayıların kaç tane olduğunu bulunuz.  (Secondly, find the numbers of prime numbers between 0 and 1000)

public class primeNumbers {

    public static void main(String[] args) {

        int i;
        int count = 0;

        for (i = 2; i < 1000; i++){
            if (isPrime(i)) System.out.println(i);

        }

        System.out.println("---------------------------------------\n");

        for (i = 2; i < 1000; i++){

            if (isPrime(i)){
                count++;
            }
        }
        System.out.println("There are " + count + " prime numbers between 0 and 1000.\n");
        System.out.println("---------------------------------------");

    }

    public static boolean isPrime(int number){

        for (int i = 2; i < number; i++){

            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
