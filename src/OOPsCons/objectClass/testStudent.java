package OOPsCons.objectClass;

/**
 * Created by akshay.pokley on 6/12/2018.
 */
public class testStudent {
    public static void main(String args[]) {

        Student student = new Student();
/* Initialization through reference*/
        student.id = 23;
        student.name = "Akshay Pokley";

        System.out.println(student.id + " " + student.name);


        Student student1 = new Student();

        student1.id=85;
        student1.name="Akshay Pokley";
        System.out.println(student1.id + " " + student1.name);  /* Initialization through reference*/


/*Initialization through method*/

student1.insertRecord(02,"ABC");
student.insertRecord(03,"DEF");

student1.displayInformation();
student.displayInformation();

/*Initialization through method*/

    }
}
