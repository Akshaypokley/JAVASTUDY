package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by akshay.pokley on 7/7/2018.
 */
public class TestCollection1 {
    public static void main(String args[])
    {   ArrayList<String> lis=new ArrayList<String>();

        lis.add("Magesh");
        lis.add("Raj");

        ArrayList<String> list=new ArrayList<String>();

        list.add("Akshay");list.add("Ragesh");
      //  list.addAll(lis); /*Example of addAll(Collection c) method*/

      //  list.removeAll(lis); /*Example of removeAll() method*/

        list.retainAll(lis);/*Example of retainAll() method*/

        Iterator iterator=list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
