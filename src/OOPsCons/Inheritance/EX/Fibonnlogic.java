package OOPsCons.Inheritance.EX;

/**
 * Created by akshay.pokley on 12/14/2018.
 */
public class Fibonnlogic implements fibonacciInter {
    int f=0;
    int f1=1;
    int sum=0;

    @Override
    public void swapwithouttemp()
    {
        int x,y;
        x=10;
        y=20;
        System.out.println("X="+x);

        System.out.println("Y="+y);
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("X="+x);

        System.out.println("Y="+y);
    }






    @Override
    public void fblogic()
    {
   for (int i=0;i<=10;)
   {
       System.out.println(f);
       sum=i+f1;
       f=sum;
       f1=i;
       i=f;

   }
    }
    @Override
    public void powerlogic()
    {
        int sum = 0;
        for (int i=5;i>=1;i--){
        if(i%2!=0){
            if(sum<(i*i)){
                sum = (i*i)-sum;
            }else{
                sum = sum-(i*i);
            }
        }else{
            sum = sum+(i*i);
        }
    }
        System.out.println(sum);
    }


    }

