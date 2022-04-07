package _07_ForLoop;

import java.util.Scanner;

public class ssss {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz:");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {
                if (j >= i) {
                    System.out.print(j + " ");
                } else System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
