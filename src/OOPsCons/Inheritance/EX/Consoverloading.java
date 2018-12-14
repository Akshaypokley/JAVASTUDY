package OOPsCons.Inheritance.EX;



public class Consoverloading {

    public static void main(String args [])
    {
        Consoverloading d= new Consoverloading();
        Consoverloading d1= new Consoverloading("g");
        Consoverloading d2= new Consoverloading();
    }


    int res;
    public  Consoverloading ()
    {
        res=100;
        System.out.println("1"+res);
    }

    public Consoverloading (String d)
    {

        System.out.println(d);
    }

    public  Consoverloading (int j,int h)
    {
     res=res+j+h;
        System.out.println("3"+res);
    }
}
