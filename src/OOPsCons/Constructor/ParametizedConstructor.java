package OOPsCons.Constructor;

/**
 * Created by akshay.pokley on 6/12/2018.
 */
public class ParametizedConstructor {

    int id;
    String name;

    ParametizedConstructor(int rollno,String nm)
    {
        id=rollno;
        name=nm;
    }

    void dispaly()
    {
        System.out.println(id+" "+" "+name);
    }
}
