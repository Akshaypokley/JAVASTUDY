package Bynaveen.OOPConcepts1;

public class wrapperclassConcepts {

    public static void main(String args[])
    {

        String num="124";
        System.out.println(num+26);
        //data conversion string into integer
        int x=Integer.parseInt(num);
        System.out.println(x+26);
        //wrapper class are Integer ,Boolean ,double

        String j="85.36";
        double d=Double.parseDouble(j);
        System.out.println(d+.10);

        int k=322;
        String js=String.valueOf(k);
        System.out.println(js);


        String kl="121";

        int jk=Integer.parseInt(kl);//we got nummber formate exception
        System.out.println(jk);
    }
}
