import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class No4_Getdigts {


    public static void main(String[] args) {
        System.out.print("Input six non-negative digits: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String num = String.valueOf(x);
        int len = num.length();
        System.out.println("Digits of " + x + " :");
        if (99999 < x && x < 1000000) {
        for (int i = 0; i < len; i++) {
            int j = Character.digit(num.charAt(i), 10);
            System.out.print(" " + j);

        }


    }
        else {
        System.out.println("Invalid input");
    }
}
}
