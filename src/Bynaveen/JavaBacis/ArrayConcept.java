package Bynaveen.JavaBacis;

import java.util.Objects;

/**
 * Created by akshay.pokley on 10/22/2018.
 */
public class ArrayConcept {

    public static void main(String args[])
    {
        //Array is store similar data type values in array variables

        int i[]=new int[4]; //int i is a simpal variable / int i [] it is a Array variable
        //lowest bound/index is equal to 0
        //upper bound/index is equal to n-1 (size of array -1)
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;


        System.out.println(i[2]);
        System.out.println(i[3]);
       // System.out.println(i[4]);//while we try to print the this array of index 4 then we
        // got ArrayIndexOutOfBoundsException because we took  size of array  4 & try to print 5th value
        // it a one dimensional array
        //single variable can store multiple value with similar data type
        //disadvantages:- 1.size is fixed  /this is static array -- to overcome this problem we used collections,like array list, hash table it is also called as dynamic array
       //                 2.store only similar data type-- to overcome this problem we used object array


        System.out.println(i.length);// here we go the size of array/length of array

        System.out.println("print all the values of array using for loop");
        //print all the values of array

        for(int j=0;j<i.length;j++)
        {
            System.out.println(i[j]);
        }
        System.out.println("print all the values of array using while loop");
        int k=0;
        while(k<i.length)
        {
            System.out.println(i[k]);
            k++;
        }

        double k1[]=new double[3];
        char c[]= new char[3];
        String str[]=new String[3];

        k1[0]=2.36;
        k1[1]=54.2;
        k1[2]=58.36;

        for (int k2=0;k2<k1.length;k2++)
        {
            System.out.println(k1[k2]);
        }

        c[0]='A';c[1]='B';c[2]='C';

        for (int c2=0;c2<c.length;c2++)
        {
            System.out.println(c[c2]);
        }

        str[0]="Akshay"; str[1]="Rajaram"; str[2]="pokley";

        for (int str1=0;str1<str.length;str1++)
        {
            System.out.println(str[str1]);
        }

        //Object Array.....
        //Object is a super class of all the class in java/ it is used store the value of any data type

        System.out.println("Array of object");
        Object ob[]=new Object[6];

        ob[0]="Akshay";
        ob[1]=012;
        ob[2]=23.32;
        ob[3]=6;
        ob[4]=35;
        ob[5]='P';

        int k11=0;
        while(k11<ob.length)
        {
            System.out.println(ob[k11]);
            k11++;
        }

for(k11=0;k11<ob.length;k11++)
{System.out.println(ob[k11]);}

    }





}
