package JavaPrct;

import java.util.Scanner;

/**
 * Created by akshay.pokley on 1/10/2019.
 */
public class Removechar {
 static    String strw;
    public static String removchar(String str, char c)
    {
        if (str==null)
      return str=null;
        Scanner scanner=new Scanner(System.in);
 strw=scanner.nextLine();
        System.out.println("repace with :"+str);
    return  str.replaceAll(Character.toString(c),strw);
    }

    public static void main(String args[])
    {
        System.out.println(removchar("Akshay",'A'));
    }
}
