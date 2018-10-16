package Collection.ArrayList.Array;

/**
 * Created by akshay.pokley on 6/7/2018.
 */
public class EAcar {
    public static void main(String args[])
    {
        String []acars={"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};

        int Ilcar=acars.length;

        System.out.println("The length of acars array ==> "+Ilcar);

        for(int inum=0;inum<Ilcar;inum++)
        {
            System.out.println("The name of the car is ==>"+" "+acars[inum]+" "+"Located on index=>"+inum);
        }
    }
}
