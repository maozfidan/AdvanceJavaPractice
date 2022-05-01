package _08_While_DoWhile;

import java.util.*;
import java.util.stream.Collectors;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz
       //Scanner scan = new Scanner(System.in);
       //System.out.print("bir metin giriniz : ");
       //String  str = scan.nextLine();
       //int index=0;
       //do {
       //	if (index%2==1){
	//		System.out.print(str.charAt(index)+" ");
	//	}
       //	index++;
	//}while(index<str.length());



        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        List<String> metin=new ArrayList<>(Arrays.asList("Lambda candir"));

        indexTeksayiYazdir( metin);
    }

    public static  void indexTeksayiYazdir( List<String> metin){

        String tekeleman= String.valueOf(metin.
                stream().
                map(String::length).
                filter(t->t%2!=0).
                sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length()))));

        System.out.println(tekeleman);


                }

}
