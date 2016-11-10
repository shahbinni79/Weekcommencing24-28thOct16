import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class No5_Revenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity");

        int quantity = sc.nextInt();
        System.out.println("Enter unit cost in £ ");

        double unit_cost = sc.nextDouble();

        double revenue = quantity * unit_cost;
        System.out.println("Revenue is £"+revenue);

    }
}
