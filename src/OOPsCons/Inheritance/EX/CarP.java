package OOPsCons.Inheritance.EX;

/**
 * Created by akshay.pokley on 12/14/2018.
 */
public class CarP {
    private int CarNo=4503;
    public String Cname="BMW";
    protected  String Cdetails="HFJ SFS JS SYS HS";
    int Cprice=4500000;


public void Carclsaa()
{

    System.out.println(CarNo);
    System.out.println(Cdetails );
    System.out.println(Cname);
    System.out.println(Cprice);
}
    public void Carclsaa(int g)
    {

        System.out.println(CarNo);
        System.out.println(Cdetails );
        System.out.println(Cname);
        System.out.println(Cprice+g);
    }

}