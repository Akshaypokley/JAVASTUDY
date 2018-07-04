package Array;

/**
 * Created by akshay.pokley on 7/4/2018.
 */
public class array3d {

    public static void main(String arghs[])

    {

        int h[][][]=new int[3][3][3];

        for(int i=0;i<h.length;i++) {
            for (int j = 0; j < h[i].length; j++)
            {
                for (int k = 0; k < h[i][j].length; k++) {
                   System.out.println(i+" "+j+" "+k);
                 break;  // System.out.println(h[i].length +" "+h[i][j].length);
                }
       }

        }
    }
}
