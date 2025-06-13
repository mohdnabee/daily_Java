package AraaysJava.d1Array;

//. Find the maximum element in an array: Write a program to find the maximum element in an array.

import java.util.Scanner;

public class maxElemnt {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
// maximum
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // minimum
            int min = arr[0];
            for (int i =1 ;  i<arr.length;i++){
                if (arr[i]<min){
                    min=arr[i];
                }
            }

// sum of array 
            int sum =0 ;
            for (int i =0; i<arr.length;i++){
                sum+=arr[i];

            }

            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: "+ min);
            System.out.println("sum of elements : "+sum);

            scanner.close();
        }
    }

