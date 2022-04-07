package _12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        int sayi1=12;
        int sayi2=14;
        int sayi3=5;
        int sayi4=44;
        int sayi5=72;

      topla(sayi3,sayi2,sayi5,sayi4,sayi1);

    }

    public static void topla(int carpilacakSayi, int... toplanacakSayilar) {

        int toplam=0;
        for (int each: toplanacakSayilar
             ) {
            toplam+=each;
        }

        System.out.println(toplam);
        System.out.println(toplam*carpilacakSayi);


    }
}
