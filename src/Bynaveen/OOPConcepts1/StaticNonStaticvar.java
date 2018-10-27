package Bynaveen.OOPConcepts1;

public class StaticNonStaticvar {

    //global variable :- scope of global variable will be available across all the function with some condition --like if it is static variable or non static

    String name = "Akshay";//non static global variable
    static int age = 25;//static global variable

    public static void main(String[] args) {

        //how to call static method and var
        //direct calling
        sum();
        //call by class name

        StaticNonStaticvar.sum();
        System.out.println(age);
        System.out.println(StaticNonStaticvar.age);

        //How to call nonstatic method and var -we always call non static method with object

        StaticNonStaticvar obj=new StaticNonStaticvar();
        obj.sendmail();
        System.out.println(obj.name);

        //can i access static method by using object reference? yes
        obj.sum();//warning will given
    }

    public void sendmail() {
        System.out.println("Send mail method");
    }

    public static void sum()
    {
        System.out.println("Sum static method");
    }
}
