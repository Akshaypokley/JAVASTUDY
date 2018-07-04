package OOPsCons.ThisKeyword;

/**
 * Created by akshay.pokley on 6/21/2018.
 */
public class reusingconstructor {
    int inum;
    String st;
    String st2;
    double dnu;

    public reusingconstructor(int inum, String st, String st2) {
        this.inum = inum;
        this.st = st;
        this.st2 = st2;

    }

    reusingconstructor(int inum, String st,String st2,  double dnu)
    {
        this(inum,st,st2);/*reusing constructor  */
        this.dnu=dnu;

    }

    void display()
    {
        System.out.println(inum+"-"+st+"-"+st2+"-"+dnu);
    }

    public static void main(String args[])
    {
        reusingconstructor reusingconstructor1=new
                reusingconstructor(01,"A","B"),
        reusingconstructor12=new reusingconstructor(02,"C","D",4.3);

        reusingconstructor1.display();
        reusingconstructor12.display();
    }
}
