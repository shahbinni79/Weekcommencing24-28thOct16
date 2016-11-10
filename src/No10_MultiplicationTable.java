import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class No10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter up to which number you need multiplication table: ");
        int n = sc.nextInt();


        System.out.format("      ");
        for(int i = 1; i<=n;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for(int i = 1 ;i<=n;i++) {

            System.out.format("%4d |",i);
            for(int j=1;j<=n;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
//        for (int i = 1; i <= n; i++) {
//            System.out.format("%4d | ",i);
//            for (int j = 1; j <= n; j++) {
//                System.out.print(i*j + " ");
//            }
//            System.out.println();

//        }
    }

}
