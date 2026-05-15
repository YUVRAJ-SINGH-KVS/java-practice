import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        System.out.println("enter temperature in celsius this will change it to Fahrenheit :-   ");
        Scanner s = new Scanner(System.in);
        double oldtemp = s.nextDouble();
        double newtemp = ((oldtemp*9)/5)+32;
        System.out.println("temperature in Fahrenheit is :- "+ newtemp);
    }
}
