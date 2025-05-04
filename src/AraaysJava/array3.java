package AraaysJava;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        // defining of an array (2)
        // type [] arrayName = {1,2,3,4,5,6}

//        int [] marks = {97,98,95};
//
//        for ( int i = 0; i<3 ; i++){
//
//            System.out.println(marks[i]);}

        //  user input of an array

        Scanner  sc = new Scanner(System.in);
        int size= sc.nextInt();
        int [] numbers = new int[size];

        // input ke liye
        for (int i=0; i<size;i++){
            numbers[i]= sc.nextInt();
        }

        // output ke liye
        for (int i=0; i<size; i++){

            System.out.print(numbers[i]+" ");

        }


    }
}
