package practice;
import java.util.Scanner;
public class Task3 {
    public static int scale;
     public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Please rate the product a scale of 1 to 5: ");

        scale = sc.nextInt();

        if (scale == 1) System.out.print("RATING *");
        if (scale == 2) System.out.print("RATING **");
        if (scale == 3) System.out.print("RATING ***");
        if (scale == 4) System.out.print("RATING ****");
        if (scale == 5) System.out.print("RATING *****");
    sc.close();
    }
}
