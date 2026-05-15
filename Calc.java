import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("write 1 for add 2 for subtract 3 for multiplication 4 for division :-");
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        if (val == 1){
            System.out.println("Enter first number :- ");
            Scanner sadd1 = new Scanner(System.in);
            double addno_1 = s.nextDouble();

            System.out.println("Enter second number :- ");
            Scanner sadd2 = new Scanner(System.in);
            double addno_2 = s.nextDouble();
            double sum = addno_1+addno_2;
            System.out.println("Sum is \n:- "+sum);
        } else if (val==2) {
            System.out.println("Enter first number :- ");
            Scanner ssub1 = new Scanner(System.in);
            double subno_1 = s.nextDouble();

            System.out.println("Enter second number :- ");
            Scanner ssub2 = new Scanner(System.in);
            double subno_2 = s.nextDouble();
            double difference = subno_1 - subno_2;
            System.out.println("difference is \n:- "+difference);

        } else if (val==3) {
            System.out.println("Enter first number :- ");
            Scanner smul1 = new Scanner(System.in);
            double mulno_1 = s.nextDouble();

            System.out.println("Enter second number :- ");
            Scanner smul2 = new Scanner(System.in);
            double mulno_2 = s.nextDouble();
            double product = mulno_1*mulno_2;
            System.out.println("product is \n:- "+ product);
        }else{
            System.out.println("Enter first number :- ");
            Scanner divd1 = new Scanner(System.in);
            double divno_1 = s.nextDouble();

            System.out.println("Enter second number :- ");
            Scanner divd2 = new Scanner(System.in);
            double divno_2 = s.nextDouble();
            double fraction = divno_1 / divno_2;
            System.out.println("division is \n:- "+ fraction);
        }

    }
}
