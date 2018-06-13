package OOPsCons.Constructor;

/**
 * Created by akshay.pokley on 6/13/2018.
 */
public class Copycostructorwithoutconstrutor {

    String str;
    double slary;
    Copycostructorwithoutconstrutor (String h, double s)
    {
        str=h;
        slary=s;
    }

    Copycostructorwithoutconstrutor(){}


    void display()
    {
        System.out.println(str+" "+slary);
    }

}
