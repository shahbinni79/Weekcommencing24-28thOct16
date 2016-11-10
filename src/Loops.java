import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class Loops {
    public static void main(String[] args) {
        System.out.println("Enter numbers of row");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for (int k = 0; k <= n-i; k++) {
                System.out.print("*");
            }
            System.out.println("");

        }


    }
}
