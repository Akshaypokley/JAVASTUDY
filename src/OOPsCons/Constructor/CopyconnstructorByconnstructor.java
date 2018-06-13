package OOPsCons.Constructor;

/**
 * Created by akshay.pokley on 6/13/2018.
 */
public class CopyconnstructorByconnstructor {

    int inuu;
    double df;

    CopyconnstructorByconnstructor(int inc, double dfc) {
        inuu = inc;
        df = dfc;
    }

    CopyconnstructorByconnstructor(CopyconnstructorByconnstructor s) {
        inuu = s.inuu;
        df = s.df;
    }

    void display()
    {
        System.out.println(inuu+" "+df);
    }
}
