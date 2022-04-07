package _12_Varargs;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve
        int sayi=10;
        int sayi1=12;
        String str1="m";
        String str2="e";
        String str3="r";
        String str4="v";
        String str5="e";


        kelimeBirlerstirme(sayi,sayi1,str1,str2,str3,str4,str5);


        String str6="l";
        String str7="e";
        String str8="r";
        String str9="e";
        String str10="g";
        String str11="i";
        String str12="t";
        kelimeBirlerstirme(sayi,sayi1, str1,str2,str3,str4,str5,str6,str7,str8,str9,str10,str11,str12);

    }

    private static void kelimeBirlerstirme(int sayi,int sayi1, String... str) {

        String kelimer="";

        for (String each: str
             ) {
            kelimer+=each;
        }
        System.out.println("saat"+ sayi+ "da "+kelimer);
    }


}

