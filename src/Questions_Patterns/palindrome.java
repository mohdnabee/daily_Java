package Questions_Patterns;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int orginal = a;
        int reverse =  0;

        while (a>0){
            int digit = a % 10 ;
            reverse =  reverse * 10 + digit ;
            a = a / 10;
        }
        if (orginal == reverse)
        {
            System.out.println("its palindrome");
        }
        else {
            System.out.println("its not a palindrome" );
        }


    }
}
