import java.util.Scanner;
import java.lang.Math;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle :- \n");
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double pi = Math.PI;
        double area = pi*Math.pow(radius,2);
        System.out.println("Area is :"+ area);

    }
}
