package Bynaveen.JavaBacis;

public class Loopsconcepts {


    public static void main(String[] args) {
        //1. while loop

        int inum = 0;//initialization
        while (inum <9)//conditional
        {
            System.out.print(inum+", ");

            inum=inum+1;/*if we not write this line then they giving me infinite loop this is
             disadvantage of while loop(incremental part)
*/
        }

        System.out.println("\n*************************************");

        //2. for loop

        for (int j=0;j<=5;j++)//initialization,conditional,incremental/decremental
        {
            System.out.println(j);

        }
        System.out.println("\n****************10 to 1*********************");
        //try to print 10 to 1

        for (int k=10;k>=-10;k--)
        {
            System.out.println(k);
        }
    }
}
