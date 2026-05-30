package java_practice;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter the no. for factorial :- ");
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        int fact = 1;
        for (int i=no ; i > 0 ; i--){
            fact *= i ;
        }s.close();
        System.out.println("factorial is :- "+ fact);
    }
}
