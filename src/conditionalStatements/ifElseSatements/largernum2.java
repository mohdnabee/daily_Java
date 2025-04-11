package conditionalStatements.ifElseSatements;

import java.util.Scanner;

public class largernum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int num1 = sc.nextInt();
        System.out.println("enter the 2nd  number");
        int num2 =  sc.nextInt();

        if (num1 > num2){
            System.out.println("num1 is greater");
        } else if (num2 > num1) {
            System.out.println("num2 is greater");
        }else {
            System.out.println("is equal");
        }
    }
}
