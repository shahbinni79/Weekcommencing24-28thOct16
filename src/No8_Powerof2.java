import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class No8_Powerof2 {
    public static void main(String args[])
    {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();

        //  int other = 1;
        if((n > 0) && ((n & (n - 1)) == 0))
        {
            System.out.println("The number is a power of two");
        }
        else
        {
            System.out.println("The number is a  not a power of two");
        }
    }

}
