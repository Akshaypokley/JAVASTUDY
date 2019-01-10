package JavaPrct;

/**
 * Created by akshay.pokley on 1/10/2019.
 */
public class Fibonacciseries {

    public static  void main(String args [] )

    {
        int f1=0;
        int f2=1;
        int sum=0;

for(int i=0;i<21;)
{
    System.out.print(f1);

    sum=i+f2;
    f2=i;
    f1=sum;
    i=f1;

}
    }
}
