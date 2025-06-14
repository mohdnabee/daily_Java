package AraaysJava.hardAndEasy2d;

import java.util.Scanner;

public class findX {
    public static void main(String[] args) {
        int [][] matrix =  {{1,2}, {3,4}};
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the number to find : ");
        int findX= sc.nextInt();
        boolean found =  false;

        for ( int i =0;  i<matrix.length; i++){
            for (int j =0;  j<matrix.length;j++){


                if (matrix[i][j] ==  findX){
                    System.out.println("Found at index ("+i+","+j+")");
                    found =  true;
                    break;
                }
            }
            if (found)break;
        }

        if (!found){
            System.out.println("Number Not Found In Matrix . . .");
        }



    }
}
