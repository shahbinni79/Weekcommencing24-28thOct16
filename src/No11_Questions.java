import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class No11_Questions {
    public static void main(String[] args) {
        String x, z;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is the command keyword to exit a loop on java?");
            System.out.println(" a.int \n b.continue \n c.break \n d.exit");
            System.out.println("Enter your choice");
            char choice = sc.next().charAt(0);
            if (choice == 'c' || choice== 'C' ) {
                System.out.println("Correct!");
                z = "n";
            } else {
                System.out.println("incorrect!\nAgain?press y to continue.");
                x=sc.nextLine();
                 z = x.toLowerCase();
            }
        }
        while (z == "y");
    }

}
