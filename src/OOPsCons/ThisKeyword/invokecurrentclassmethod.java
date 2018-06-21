package OOPsCons.ThisKeyword;

/**
 * Created by akshay.pokley on 6/21/2018.
 */
public class invokecurrentclassmethod {

    void disp1()

    {
        System.out.println("Print disp1");
    }

    void disp2()
    {


        System.out.println("Print disp2");
              System.out.println("*******************");
      disp1();
    }
}
