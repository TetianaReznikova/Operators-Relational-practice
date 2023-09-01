package practice;
import java.util.Scanner;
public class Task1 {
    public static double result;
    public static double bonus;
    private final static String CURRENCY = "UAH";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("If you want to calculate your bonus, enter the amount of your result, %s: ",
                CURRENCY);
        result = sc.nextDouble();

        if (result <= 10000) {
            bonus = result / 100 * 10;
            System.out.print("Your bonus rate is 10%");
            System.out.printf("%nYour bonus is %s: %.2f",
                    CURRENCY, bonus);

        } else if (result > 10000 & result <= 20000) {
            bonus = result / 100 * 15;
            System.out.print("Your bonus rate is 15%");
            System.out.printf("%nYour bonus is %s: %.2f",
                    CURRENCY, bonus);
        } else if (result > 20000) {
            bonus = result / 100 * 20;
            System.out.print("Your bonus rate is 20%");
            System.out.printf("%nYour bonus is %s: %.2f",
                    CURRENCY, bonus);
        }
        sc.close();
    }
}
