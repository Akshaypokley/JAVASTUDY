package OOPsCons.Constructor;

/**
 * Created by akshay.pokley on 6/13/2018.
 */
public class testCopycostructorwithoutconstrutor {

    public static void main(String args[])
    {
        Copycostructorwithoutconstrutor copycostructorwithoutconstrutor=new Copycostructorwithoutconstrutor("AKSHAY",454778)
                ,copycostructorwithoutconstrutor1=new Copycostructorwithoutconstrutor();

        copycostructorwithoutconstrutor1.str=copycostructorwithoutconstrutor.str;
        copycostructorwithoutconstrutor1.slary=copycostructorwithoutconstrutor.slary;

        copycostructorwithoutconstrutor1.display();

    }
}
