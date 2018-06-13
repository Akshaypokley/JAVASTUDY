package OOPsCons.objectClass;

/**
 * Created by akshay.pokley on 6/12/2018.
 */
public class Rectangle {

    double length,width;

    void InsertRecord(double l,double w)
    {
        length =l;
        width=w;


    }

    void displayCalculation()
    {
        System.out.println("Area of Rectangel"+"=> "+length*width);
    }
}
