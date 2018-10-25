package Bynaveen.JavaBacis;

/**
 * Created by akshay.pokley on 10/25/2018.
 */
public class TwoDimenssionalArray {
    public static void main(String []args)
    {
        String [][] str=new String[3][5];

        System.out.println(str.length);//total no of rows

        System.out.println(str[0].length);//total no of Column
        str[0][0]="A";
        str[0][1]="B";
        str[0][2]="C";
        str[0][3]="D";
        str[0][4]="E";

        str[1][0]="F";
        str[1][1]="G";
        str[1][2]="H";
        str[1][3]="I";
        str[1][4]="J";

        str[2][0]="K";
        str[2][1]="L";
        str[2][2]="M";
        str[2][3]="N";
        str[2][4]="O";

        for (int i=0;i<str.length;i++)
        {
            for (int j=0;j<str[i].length;j++)
            {
                System.out.println(str[i][j]);
            }
        }

    }
}
