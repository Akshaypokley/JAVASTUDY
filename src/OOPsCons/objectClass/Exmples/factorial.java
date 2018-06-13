package OOPsCons.objectClass.Exmples;

/**
 * Created by akshay.pokley on 6/12/2018.
 */
public class factorial {
int fact=1;
    void fact(int n)
    {
        for(int i=1;i<=n;i++)
        {
          fact=fact*i;


        }

        System.out.println(fact);
    }
}
