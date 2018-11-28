package Bynaveen.Collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by akshay.pokley on 11/28/2018.
 */
public class Link {

    public static void main (String args[])
    {

        LinkedList <String> linkedList=new LinkedList<>();

        linkedList.add("K1");
        linkedList.add("K1");
        linkedList.add("d");
        linkedList.addFirst("J");

        Iterator i=linkedList.iterator();
while(i.hasNext())
{      System.out.println(i.next());
}
    }
}
