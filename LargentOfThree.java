import java.util.Scanner;

public class LargentOfThree {
    public static void main(String[] args) {
        System.out.println("enter first number");
        Scanner s = new Scanner(System.in);
        double firstno = s.nextDouble();
        System.out.println("ok");

        System.out.println("enter second number");
        Scanner s2 = new Scanner(System.in);
        double secondno = s.nextDouble();
        System.out.println("ok");

        System.out.println("enter third number");
        Scanner s3 = new Scanner(System.in);
        double thirdno = s.nextDouble();
        System.out.println("ok");
        if(firstno>secondno && firstno>thirdno){
            System.out.println("first number is largest");

        }else if(secondno>firstno && secondno>thirdno){
            System.out.println("second number is largest");

        }else {
            System.out.println("third number is largest");

        }
    }
}
