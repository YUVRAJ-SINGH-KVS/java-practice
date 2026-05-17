import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("enter a number :- ");
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        int temp = 0;
        for (int i = 1; i <= no ; i ++ ){
            temp = i-1 + i;
            System.out.println(temp);
        }

    }
}
