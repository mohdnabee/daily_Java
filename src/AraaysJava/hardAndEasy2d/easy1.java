package AraaysJava.hardAndEasy2d;

import java.util.Scanner;

public class easy1 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int [][] matrix =  new int[3][3];

       // inputs elements
        System.out.println("Enter the 3X3 matrix elements :");
        for (int i=0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print("Element ["+i+"]["+j+"]:");
                matrix[i][j]= sc.nextInt();
            }
        }

        //  display matrix
        System.out.println("The 3X3 matrix is : ");
        for (int i =0;  i<3;i++){
            for (int j =0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
