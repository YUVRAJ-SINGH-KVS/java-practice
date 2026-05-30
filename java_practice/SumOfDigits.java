package java_practice;
import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("enter a number to do  sum of digit :- ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int sum = 0;
        while(input!=0){
            sum += input % 10;
            input = (int)input/10;

        }
        s.close();
        System.out.println("sum is :- "+sum);
    }
}


