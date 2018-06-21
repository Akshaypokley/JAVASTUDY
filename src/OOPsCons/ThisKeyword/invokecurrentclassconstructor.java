package OOPsCons.ThisKeyword;

/**
 * Created by akshay.pokley on 6/21/2018.
 */
public class invokecurrentclassconstructor {

    invokecurrentclassconstructor()
    {
        System.out.println("null");
    }
    invokecurrentclassconstructor(int x)
    {
        this();
        System.out.println(x);
    }
/*Calling parameterized constructor from default constructor:*/
public static void main(String args[])
{
    invokecurrentclassconstructor invokecurrentclassconstructor2=new
            invokecurrentclassconstructor(12),invokecurrentclassconstructor3=
            new invokecurrentclassconstructor(25);
}

}

