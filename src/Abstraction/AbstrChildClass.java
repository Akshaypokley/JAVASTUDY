package Abstraction;

/**
 * Created by akshay.pokley on 1/4/2019.
 */
public class AbstrChildClass extends AbstractSuperclass {
  static   int c=10;
    public void test1()
    {
        int c=10;
    }
    public void test2()
    {
        System.out.println(c);
    }



    public static void main(String args[])
    {
       /* AbstractSuperclass abstractSuperclass=new AbstrChildClass();
        abstractSuperclass.abstracClass();
*/
        System.out.println(c);

    }
}
