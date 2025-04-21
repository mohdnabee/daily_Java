package AraaysJava.array2D;

import java.util.Scanner;

public class example1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows ");
        int rows = sc.nextInt();;
        System.out.print("Enter the columns");
        int cols= sc.nextInt();
        // Declaration of 2d array
        // type [][] arrayName = new Type [rows] [columns]
        int [][] numbers =  new int[rows][cols];

        // outer loop for input

        for (int i = 0; i<rows; i++){
            // columns
            for (int j = 0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // output

        for (int i =0; i<rows ; i++){
            for (int j =0 ; j<cols; j++){
                System.out.print(" | ");
                System.out.print(numbers[i][j]+ " | ");
            }
            System.out.println();
        }
    }
}
