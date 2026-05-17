import java.util.Scanner;


public class ReverseofNumber{
    public static void main(String[] args) {
        System.out.println("enter a number to do  sum of digit :- ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int rev = 0;

        for(int i = 1; input!=0;i++) {

            if(input%10!=0){
                int temp  = (int) (input % 10);
                rev += temp;
                input = (int)input/10;
                rev *=10;
            }
            if(input%10==0){
                rev += input;
                System.out.println("reversed digit is :- "+rev);
            }
            }









    }
}


