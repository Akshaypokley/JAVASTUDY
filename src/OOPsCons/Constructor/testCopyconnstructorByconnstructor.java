package OOPsCons.Constructor;

/**
 * Created by akshay.pokley on 6/13/2018.
 */
public class testCopyconnstructorByconnstructor {

    public static void main(String args[])
    {
        CopyconnstructorByconnstructor copyconnstructorByconnstructor=new CopyconnstructorByconnstructor(01,154)
                ,copyconnstructorByconnstructor1=new CopyconnstructorByconnstructor(copyconnstructorByconnstructor);
        copyconnstructorByconnstructor1.display();


    }
}
