package java_practice;
import java.util.Scanner;


public class ReverseofNumber{
    public static void main(String[] args) {
        System.out.println("enter a number to do  sum of digit :- ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int reversed = 0;
        s.close();

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
                }

                System.out.println("Reversed Number: " + reversed);

        










    }
}


