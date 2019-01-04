package Polymorphism;

/**
 * Created by akshay.pokley on 1/4/2019.
 */
public class Methodeoverlrriding extends ovrridingparClass {

  public   void childClaa()
    {
        System.out.println("I am child");
    }

    public static void main(String args[])
    {
        ovrridingparClass ovrridingparClass=new Methodeoverlrriding();
        ovrridingparClass.parent();

        Methodeoverlrriding methosOverloading=new Methodeoverlrriding();
        methosOverloading.childClaa();


    }
}
