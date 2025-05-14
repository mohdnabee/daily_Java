package AraaysJava;

import java.util.Scanner;
// take an array as input from the user .Search for a given number X and print the index at which it occurs .
public class findX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an array: ");
        int size =  sc.nextInt();
        int [] numbers = new int[size];

        // input loop
        for (int i =0 ;  i<size; i++){
            System.out.print("enter the element "+(i+1)+": " );
            numbers[i]= sc.nextInt();
        }

        // find the x value
        System.out.print("Enter the value Of x:");
        int x = sc.nextInt();

        // output
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]==x){
                System.out.println("X found at index :"+i);
            }
            }

    }
}
