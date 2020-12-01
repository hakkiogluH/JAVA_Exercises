package Exercises_HHO.Loops;

public class IciceFor_CarpimTablosu {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){

            System.out.println("***************************************************");
            System.out.println();
            for (int j = 1; j<= 10; j++){
                System.out.println("i: " + i + ",  j: " + j + "          i x j = " + i*j);
            }
            System.out.println();
            System.out.println("***************************************************");
        }
    }
}
