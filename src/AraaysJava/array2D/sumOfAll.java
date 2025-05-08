package AraaysJava.array2D;

import java.util.Scanner;

public class sumOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int rows = sc.nextInt();
        System.out.println("Enter the column");
        int col = sc.nextInt();

        // declaration of 2d array
        int [][] numbers =  new int[rows][col];


        //  loop for input of an array
        for (int i =0; i<rows; i++){
            for (int j =0 ; j<col ; j++){
                numbers [i][j]= sc.nextInt();
            }
        }

        //  logic for sum of all elemnets
        int sum =0;
         for (int i = 0 ; i<numbers.length; i++){
             for (int j = 0;j<numbers.length;j++){
                 sum += numbers[i][j];
             }
             System.out.println("sum of column :"+ i +":"+sum );
         }


    }
}
