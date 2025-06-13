package AraaysJava.d1Array;

import java.util.Scanner;

// sum ,  greater than,

public class inputArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int sum =  0;
        int max = 0;
        int n = sc.nextInt();
        System.out.println("Enter arr values");
        int [] arr = new int [n];

        for (int i =0 ; i<n ; i++)
        {
          arr[i]=  sc .nextInt();
        }
        for (int j  = 0 ; j<arr.length; j++){
            System.out.print(arr[j]);
            System.out.println();
            // sum ke liye array elements
            sum += arr[j];

        }

       //  max ke liye array elements
        for (int k = 0 ; k <arr.length ; k++){
            if (arr[k] > max){
                max = arr[k];
            }
        }

        System.out.println("Sum of array elements is " + sum);
        System.out.println("MAX value of array is "+max);


    }
}
