import java.util.Scanner;

/**
 * Created by sreenivas on 31/10/2016.
 */
public class No12_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age in year.");
        int age = sc.nextInt();
        System.out.println("Enter your Nationality.");
       Scanner sc1 = new Scanner(System.in);
        String nationality1 = sc1.nextLine();
        String nationality = nationality1.toUpperCase();
        System.out.println("Are you working?");
        String working_status1=sc1.nextLine();
        String working_status = working_status1.toUpperCase();
        if (age>=18 && nationality.equals("BRITISH")&& working_status.equals("YES")){
            System.out.println("You are eligible to vote");
        }
        else if (age>=18 && nationality.equals("ASIAN")&& working_status.equals("YES")){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("you are not eligible to vote.");
        }

    }
}
