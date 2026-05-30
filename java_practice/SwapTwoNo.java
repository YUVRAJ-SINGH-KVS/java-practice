package java_practice;
import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args) {
        System.out.println("enter first number to swap");
        Scanner s = new Scanner(System.in);
        double firstno = s.nextDouble();
        System.out.println("ok");

        System.out.println("enter second number to swap");
        
        double secondno = s.nextDouble();
        System.out.println("ok");

        double temp ;

        temp = firstno;
        firstno = secondno;
        secondno = temp ;
        s.close();

        System.out.println("after swap first number became :- "+firstno+"\nand second number became :- "+secondno);


    }
}
