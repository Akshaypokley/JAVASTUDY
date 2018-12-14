package OOPsCons.Inheritance.EX;

import java.nio.IntBuffer;

/**
 * Created by akshay.pokley on 12/14/2018.
 */
public class reverStrign {

    public static void main(String args[])
    {
        String str="My Name is Akshay";
        int age=25;

    //    IntBuffer intBuffer=new IntBuffer(age) ;
        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

    }
}
