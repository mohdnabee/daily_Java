package exercise1Java;
// enter the 3 numbers from the user and make function to print average...

import java.util.Scanner;

public class averageOf3 {

    //  function

    public static  void AverageOf3(int a , int b , int c){
        double average =  (a +b +c) /3.0;
        System.out.println("The Average value is :"+average);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int num3 = sc.nextInt();
        // call the function
        AverageOf3(num1,num2,num3);

    }

}
