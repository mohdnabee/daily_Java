package AdvanceDSAMaster.Sorting;

import java.util.Scanner;

public class SelcttionSort {

    public  static  void printArray(int arr[]){
        for (int i =0 ;  i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int [] arr = new int [n];

        for (int i =0 ; i<n ; i++)
        {
            arr[i]=  sc .nextInt();
        }


//        int arr[] = {10, 4, 2, 1, 6, 8};

        for (int i = 0; i < arr.length; i++) {

            int smallest  =  i ;
            for (int j = i+1; j<arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

//            swap

            int temp  =  arr[smallest] ;
            arr[smallest] = arr[i];
            arr[i] = temp;
        }


        printArray(arr);

    }

}
