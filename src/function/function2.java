package function;

import java.util.Scanner;

public class function2 {

// make a new function name is calculateSum
    public  static  int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number:");
        int a = sc.nextInt();
        System.out.print("enter the Second number:");
        int b= sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("sum of two numbers is: "+sum);
        // call the function


    }
}
// make a function to add 2 numbers and return sum......=======//============================//=========