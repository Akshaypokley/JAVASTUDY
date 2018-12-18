package OOPsCons.Inheritance.EX;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Arraylistloop {
    public static void main(String  args [])
    {

        ArrayList<String > str=new ArrayList<String>();

        str.add("A");
        str.add("B");
        str.add("C");
        str.add("D");
        str.add("E");
        str.add("F");
        System.out.println("Please enter type of loop name ::");

        Scanner scanner=new Scanner(System.in);
        switch(scanner.nextLine())
        {
            case "interator":
                Iterator iterator=str.iterator();
                while(iterator.hasNext())
                {
                    System.out.println(iterator.next());
                }

                break;

            case "For Loop":
                for(String f:str)
                {
                    System.out.println(f);
                }
                break;

            case "listInter":
                ListIterator<String> g=str.listIterator(str.size());
                while (g.hasPrevious())
                {
                    String gh=g.previous();
                    System.out.println(gh);
                }
                break;

            case "old loop":
                for(int i=0;i<str.size();i++)
                {
                    System.out.println(str.get(i));
                }
                break;
            case "for each":
                str.forEach(a->{
                    System.out.println(a);
                });

                break;
                default:
                    System.out.println("Invalid Type");
        }
    }
}
