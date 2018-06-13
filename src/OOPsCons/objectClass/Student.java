package OOPsCons.objectClass;

/**
 * Created by akshay.pokley on 6/12/2018.
 */
public class Student {

    int id;
    String name;
   int rollno;

   void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){System.out.println(rollno+" "+name);}
    public static void main(String args[])
    {

        Student student=new Student();

        student.id=23;
        student.name="Akshay Pokley";

        System.out.println(student.id+" "+student.name);
    }

}

