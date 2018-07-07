package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by akshay.pokley on 7/7/2018.
 */
public class testcolletionbythis {
public static void main(String args[])
{
    colletionbythis colletionbythis1=new colletionbythis(101,"Akshay",75.36)
        ,colletionbythis2=new colletionbythis(102,"Poonum",16.32)
        ,colletionbythis3=new colletionbythis(103,"Ravi",25.36);


    ArrayList<colletionbythis> list1=new ArrayList<colletionbythis>();

    list1.add(colletionbythis1);
    list1.add(colletionbythis2);
    list1.add(colletionbythis3);

    Iterator i=list1.iterator();
    while(i.hasNext()){
        colletionbythis colletionbythisw=(colletionbythis)i.next();
        System.out.println(colletionbythisw.Id+" "+colletionbythisw.str+" "+colletionbythisw.perce);
    }


}


}
