package practice;
import java.util.Scanner;
public class Task2 {
    public static void main (String[] args){

        String redColor = "red";
        String yellowColor = "yellow";
        String greenColor = "green";

        Scanner sc = new Scanner(System.in);
System.out.print("Color of traffic light: ");
String trafficLight = sc.nextLine();

        if (trafficLight.equals(redColor)) System.out.print("STOP!!!");
        if (trafficLight.equals(yellowColor)) System.out.print("ready");
        if (trafficLight.equals(greenColor)) System.out.print("GO");
    sc.close();
    }
}
