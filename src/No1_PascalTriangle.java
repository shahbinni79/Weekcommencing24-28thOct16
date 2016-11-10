import java.util.Scanner;

/**
 * Created by sreenivas on 25/10/2016.
 */
public class No1_PascalTriangle {
    public static void main(String[] args) {

        int r , x, bin, q, p;
        //Scanner s=new Scanner(System.in);                             // you can put scanner if want any number of rows
        //System.out.println("How Many Row Do you want to input: ");
       // r=s.nextInt();
        r=5;
        bin=1;
        q=0;



        while(q<r)
        {
            for(p=40-3*q;p>0;--p)
               System.out.print(" ");
            for(x=0;x<=q;++x)
            {
                if((x==0)||(q==0))
                    bin=1;
                else
                    bin=(bin*(q-x+1))/x;    // this is the equation for pascal's triangle.
               System.out.print("     ");
                System.out.print(bin);
            }

            System.out.println("");
            ++q;


        }
    }
}
