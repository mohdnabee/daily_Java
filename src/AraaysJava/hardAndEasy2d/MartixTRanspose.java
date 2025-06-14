package AraaysJava.hardAndEasy2d;

public class MartixTRanspose {
    public static void main(String[] args) {


        int [][] original =  {{1,2}, {4,5},{7,8}};

        int rows = original.length;
        int cols =  original[0].length;

        int [][]  transpose =  new int[cols][rows];

        //  transpose logic
        for (int i =0;  i<rows;  i++){
            for (int j =0; j<cols;j++){
                transpose[j][i] =  original[i][j];
            }
        }

        // print trans pose
        System.out.println("Transpose Matrix :");
        for (int i=0;  i<cols ;i++){
            for (int j=0;  j<rows ;  j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
