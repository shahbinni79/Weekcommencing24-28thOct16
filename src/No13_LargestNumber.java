import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class No13_LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number for a");
        double a = sc.nextDouble();
        System.out.println("Enter any number for b");
        double b = sc.nextDouble();
        System.out.println("Enterany number for c");
        double c = sc.nextDouble();
        if (a > 0 && b > 0 && c > 0) {


            if (a > b && a > c) {
                System.out.println("The largest number is:" + a);
            } else if (b > a && b > c) {
                System.out.println("The largest number is:" + b);
            } else {
                System.out.println("The largest number is:" + c);
            }

        }
        else{
            System.out.println("Invalid input");
        }

    }
}
