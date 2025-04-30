package function;

import java.util.Scanner;

public class function3 {
 // make a function to multiple 2 numbers and return the product || =====================//===================

public  static int calculateProduct(int a, int b){
    return a*b ;
}


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number:");
        int a = sc.nextInt();
        System.out.print("enter the Second number:");
        int b= sc.nextInt();

        System.out.println("Product of two numbers is: "+calculateProduct(a,b));
        //  direct call the function

    }
}
