import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class Digits {

    public static void main(String[] args) {
        System.out.print("Enter any number for Ascanding order: ");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int sorted = 0;
        int digits = 10;
        int sortedDigits = 1;
        boolean first = true;

        while (number > 0) {
            int digit = number % 10;

            if (!first) {

                int tmp = sorted;
                int toDivide = 1;
                for (int i = 0; i < sortedDigits; i++) {
                    int tmpDigit = tmp % 10;
                    if (digit >= tmpDigit) {
                        sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                        break;
                    } else if (i == sortedDigits-1) {
                        sorted = digit * digits + sorted;
                    }
                    tmp /= 10;
                    toDivide *= 10;
                }
                digits *= 10;
                sortedDigits += 1;
            } else {
                sorted = digit;
            }

            first = false;
            number = number / 10;
        }
        System.out.println(sorted);

        // new comment
    }
}

