package Exercises_Habip.Udemy.Arrays_Arraylists;

public class Arrays1 {
    public static void main(String[] args) {
        int [] a = new int[5];
        
        for (int i = 0; i < 5; i++){
            a[i] = i * 4 + 2;
        }

        for (int i = 0; i < 5; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }
}
