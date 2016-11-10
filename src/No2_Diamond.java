import java.util.Scanner;

/**
 * Created by sreenivas on 30/10/2016.
 */
public class No2_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input a Positive Odd Integer:");
        int x;
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("That is not an Odd Integer!");
        } else if (x < 0) {
            System.out.println("That is not a Positive Odd Integer");
        } else {


            for (int i = 1; i < x; i += 2) //This is the number of iterations needed to print the top of diamond
            // (from 1 to userInput by step of two for example with 5 = {1, 3, 5} so 3 rows.
            {
                for (int j = 0; j < x - 1 - i / 2; j++) //write correct number of spaces before, example
                // with 5 = j < 5 - 1 -i / 2, so it would first print 4 spaces before,
                // with 1 less untill it reach 0
                {
                    System.out.print(" ");              //write a space
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");              //write an asterix
                }

                System.out.println("");
            }

            // Same logic apply here but backward as it is bottom of diamond
            for (int i = x; i > 0; i -= 2) {
                for (int j = 0; j < x - 1 - i / 2; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }

                System.out.print("\n");
            }

        }
    }
}

