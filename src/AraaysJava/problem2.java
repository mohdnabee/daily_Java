package AraaysJava;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        // Find the maximum & minimum number in an array of integers.

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        // input of the array loop
        for (int i =0 ; i<size; i++){
            System.out.print("enter the element" + (i+1)+": ");
            arr[i]= sc.nextInt();
        }

        //  maximum and minimum
        int max = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        //  find maximum and minimum
        for (int i =0 ; i<arr.length;i++){
            if (arr[i]<mini){
                mini = arr[i];
            }
            if (arr[i]>max){
                max =arr[i];
            }

        }

        System.out.println();
        System.out.println("Largest number is : "+max);
        System.out.println("Smallest number is : "+mini);

    }
}
