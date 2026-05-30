package java_practice;
import java.util.Scanner;

public class ATMmenu {
    public static void main(String[] args) {
        System.out.println("press 1 for deposit 2 for withdraw 3 for balance enquiry :-");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        double balance = 0;

        switch (input){
            case 1:{
                System.out.println("enter amount to deposit :- ");
                
                double amount = s.nextDouble();
                balance += amount;
                System.out.println("Balance :- "+balance);
                break;

            }
            case 2:{
                System.out.println("enter amount to withdraw :- ");
                
                double amount = s.nextDouble();
                if (amount<balance){
                    balance -= amount;
                    System.out.println("Balance :- "+balance);
                }else{
                    System.out.println("low balance");
                    System.out.println("Balance :- "+balance);

                }
                break;

            }
            case 3:{
                System.out.println("Balance :- "+balance);


            }break;
            default:{
                System.out.println("invalid input");
            }
        }s.close();
    }
}
