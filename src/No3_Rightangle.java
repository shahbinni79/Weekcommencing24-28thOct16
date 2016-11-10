import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class No3_Rightangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows ");
        int x = sc.nextInt();
        int y = 1;

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(y + " ");
                y = y + 1;
            }
            System.out.println();
        }

    }
}
