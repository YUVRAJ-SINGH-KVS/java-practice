package java_practice;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("enter marks:-");
        Scanner s = new Scanner(System.in);

        double marks = s.nextDouble();
        if (marks>=60){
            System.out.println("Grade :- A");
        }else if (marks>=40 && marks<60){
            System.out.println("Grade :- B");
        }else if (marks>=20 && marks<40){
            System.out.println("Grade :- C");
        }else{
            System.out.println("Grade :- F");
        }s.close();
    }
}
