package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6               6
//         2 3 4 5 6               5 6
//          3 4 5 6               4 5 6
//           4 5 6               3 4 5 6
//            5 6               2 3 4 5 6
//             6               1 2 3 4 5 6

        int input = 6;

        for (int j = input; j >= input; j--) {

            if (input >= j) {
                System.out.print(j + " ");

                for (int i = input-1 ; i >= 1; i--) {
                }

                System.out.println(" ");
            }

        }

    }
}


