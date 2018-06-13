package OOPsCons.Constructor;

/**
 * Created by akshay.pokley on 6/13/2018.
 */
public class TestconstruOverloading {


    public static void main(String args[])
    {
        ConstructorOverloading constructorOverloading=new ConstructorOverloading(01,"Akshay")
                ,constructorOverloading1=new ConstructorOverloading(01,13254.32),
                constructorOverloading2=new ConstructorOverloading("Akshay",12345.32);

        constructorOverloading.display();constructorOverloading1.display();constructorOverloading2.display();

    }
}
