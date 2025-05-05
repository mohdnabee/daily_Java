package AraaysJava;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        // Take an array of numbers as input and check if it is an array sorted in ascending order.
        //E.g.-: { 1, 2, 4, 7 } is sorted in ascending order.
        //       {3, 4, 6, 2} is not sorted in ascending order.


        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        // input of an array
        for (int i=0; i<size; i++){
            System.out.print("enter the element"+(i+1)+": ");
            arr[i]= sc.nextInt();
        }

        // check an array
        boolean isAscending = true;
        for(int i =0 ; i<arr.length-1;i++){// notice arr.length-1 as a termination condition

            if(arr[i]>arr[i+1]){// this is the condition for descending order
                isAscending = false;
            }
        }

        if (isAscending)
        {
            System.out.println("The array is sorted in ascending order");
        }else
        {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}

/**
note: for(int i =0; i<arr.length-1;i++)
 is used to avoid an ArrayIndexOutOfBoundsException and ensure valid comparisons between adjacent elements in the array.
 */