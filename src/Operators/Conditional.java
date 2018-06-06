package Operators;

/**
 * Created by akshay.pokley on 6/6/2018.
 */
public class Conditional {

    public static void main(String args[])
    {
int iTen=10;
int iTwenty =20;
int ITherty=30;

boolean ibval;
int ivalue;

ibval=(ITherty==iTen+iTwenty)?true:false;
        System.out.println("R1:->"+ibval);
        ivalue  = ((ITherty == iTwenty + iTen)) ? 50: 100;
        System.out.println( "The int Value of the variable iValue is : " + ivalue ); //50

        //This is a use of Not Logical Operator
        ivalue = (!(ITherty == iTwenty + iTen)) ? 50: 100;
        System.out.println( "The int Value of the variable iValue is : " + ivalue);

    }
}
