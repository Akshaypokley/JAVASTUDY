package OOPsCons.Constructor;

/**
 * Created by akshay.pokley on 6/12/2018.
 */
public class ConstructorOverloading {

int num;
String str;
double salry;

ConstructorOverloading(int i,String s)
{
    num=i;
    str=s;
}

ConstructorOverloading(int j,double d)
{
    num=j;
    salry=d;
}

ConstructorOverloading(String st,double dnum)
{
    str=st;
    salry=dnum;
}

void display()
{
    System.out.println("Overloaded constructor"+" => "+num+" "+str+" "+salry);
}
}
