import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("enter a number :- ");
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();

        int val1 = 0;
        int val2 = 1;
        System.out.println(val1);
        System.out.println(val2);
        for (int i = 2; i <= no ; i ++ ){


            int newval = val1 + val2;
            System.out.println(newval);
            val1 = val2;
            val2 = newval;
        }

    }
}
