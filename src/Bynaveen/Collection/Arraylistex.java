package Bynaveen.Collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by akshay.pokley on 11/28/2018.
 */
public class Arraylistex {

    public static void main(String args[])
    {
        ArrayList<String>  arrayList= new ArrayList<>();

        arrayList.add("akshay");
        arrayList.add("neha");
        arrayList.add("meghna");
        arrayList.add("ramesh");
        arrayList.add("ramesh");
        Iterator it= arrayList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
