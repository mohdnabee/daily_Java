package AraaysJava.hardAndEasy2d;

import java.util.Scanner;

public class userinputMINMAX {
    public static void main(String[] args) {
        Scanner  sc =  new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int []arr =  new int[size];
        int max =  0 , min = 0;

        //  take input
        for (int i  =0 ;  i< arr.length;  i++){
            System.out.print("enter vale of index  "  + i + " : ");
            arr[i]= sc.nextInt();
        }

        // print array

        System.out.print(" your array  is : ");
        for (int i=0 ;  i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        //  min and max array
        System.out.println();

        for (int i=0 ;  i< arr.length;  i++){
            if (arr[i] >max){
                max =  arr[i];
            }
            if (arr [i]< min){
                min =  arr[i];
            }
        }
        System.out.println("max"+" "+max+" "+"min" + " "+min);
    }
}
