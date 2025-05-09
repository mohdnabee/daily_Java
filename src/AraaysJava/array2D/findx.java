package AraaysJava.array2D;

import java.util.Scanner;

public class findx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows ");
        int row = sc.nextInt();
        System.out.print("Enter the columns ");
        int col = sc.nextInt();
        int [][] arr = new int[row][col];

        //  loop for take input of a 2d array  || rows and columns
        for ( int a  = 0  ;  a <row; a++){
            for (int b = 0 ; b<col; b++){
               arr [a][b]= sc.nextInt();
            }
        }

        System.out.print("Enter the number to found array ");
        int x = sc.nextInt();

        for (int i =0; i<row;i++){
            for (int j =0; j<col; j++){
                if (arr [i][j]== x){
                    System.out.println("X found in location ( "+i+", "+j +")");
                }
            }
        }
    }
}
