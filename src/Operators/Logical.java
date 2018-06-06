package Operators;

/**
 * Created by akshay.pokley on 6/6/2018.
 */
public class Logical {
    public static void main(String[] args) {
        boolean Output_1 = true;
        boolean Output_2 = false;
        boolean Output_3 = true;
        System.out.println("Check if both the boolean variables are true : " + (Output_1 && Output_2));
        System.out.println("Check if even one of the boolean varibale is true : " + (Output_1 || Output_2));
        System.out.println("Change the state of the Output_1 to false : " + (!Output_2));
        System.out.println("Change the state of the Output_1 to false : " + (Output_3 || Output_1));
    }

}
