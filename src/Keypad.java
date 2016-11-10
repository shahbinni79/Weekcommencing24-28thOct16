import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class Keypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any key");
        String key1 = sc.next();
        String key2 = key1.toUpperCase();
        char key = key2.charAt(0);
        switch (key){
            case 'A':case 'B':case 'C':
                System.out.println("Number 2 is pressed");
                break;
            case 'D':case 'E':case 'F':
                System.out.println("Number 3 is pressed");
                break;
            case 'G':case 'H':case 'I':
                System.out.println("Number 4 is pressed");
                break;
            case 'J':case 'K':case 'L':
                System.out.println("Number 5 is pressed");
                break;
            case 'M':case 'N':case 'O':
                System.out.println("Number 6 is pressed");
                break;
            case 'P':case 'Q':case 'R':case 's':
                System.out.println("Number 7 is pressed");
                break;
            case 'T':case 'U':case 'V':
                System.out.println("Number 8 is pressed");
                break;
            case 'W':case 'X':case 'Y':case 'Z':
                System.out.println("Number 9 is pressed");
                break;

        }
    }

}
