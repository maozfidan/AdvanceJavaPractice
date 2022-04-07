package _07_ForLoop;

public class sss3 {

    public static void main(String[] args) {


        String str= "CODER";
        for (int i=0; i< str.length(); i++) {
            for(int j=0; j<=i; j++){
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
        }
    }
}
