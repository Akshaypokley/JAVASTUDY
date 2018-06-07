package Examples;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;

import java.util.Scanner;

/**
 * Created by akshay.pokley on 6/7/2018.
 */
public class AdditionofTwoNo {

    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter first number");
        int In1=scanner.nextInt();

        System.out.println("Please Enter Second number");
        int In2=scanner.nextInt();

        int Result=In1+In2;
        System.out.println("The addition of two no is =>"+" "+Result);

        int MResult=In1*In2;
        System.out.println("The multiplication of two no is =>"+" "+MResult);

        double Dresult=In1/In2;
        System.out.println("The Division  of two no is =>"+" "+Dresult);

        int w = -5 + 8 * 6;
        int x = (55 + 9) % 9;
        int y = 20 + (-3 * 5 / 8);
        int z = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.print(w + "\n" + x + "\n" + y + "\n" + z);


    }
}
