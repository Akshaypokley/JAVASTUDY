package OOPsCons.ThisKeyword;

/**
 * Created by akshay.pokley on 6/21/2018.
 */
public class TKE1 {

    int inum;
    String Str;
    double Dnum;

    TKE1(int inum,String Str,double Dnum)
    {
        this.inum=inum;
      this.Str=Str;
        this.Dnum=Dnum;
    }

    void Display()
    {
        System.out.println(inum+" "+Str+" "+Dnum);
    }

}
