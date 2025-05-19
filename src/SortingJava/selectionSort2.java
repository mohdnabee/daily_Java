package SortingJava;

import java.util.Scanner;

public class selectionSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter The size of an array : ");
        int size  = sc.nextInt();
        int arr [] = new int[size];

        // input loop
        for (int i =0 ;  i<size; i++){
            System.out.print("enter the element "+(i+1)+": " );
            arr[i]= sc.nextInt();
        }


        for (int i = 0 ;  i<arr.length-1;  i++){

            int smallest = i;
            for (int j = i+1 ;  j<arr.length; j++){
                if (arr [smallest] > arr[j]){
                    smallest = j ;
                }
            }

            // swap value
            int temp = arr[smallest];
            arr[smallest]=  arr[i];
            arr[i]=  temp;
        }

        for ( int i = 0 ;  i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
