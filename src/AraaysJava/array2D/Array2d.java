package AraaysJava.array2D;

public class Array2d {
    //  2d array means array of array || array ke andar array
    
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},  // First inner array
                {4,3,2},    // Second inner array
                {1,3,2}   // Third inner array
        };
        System.out.println(arr.length);//  find the length of the array
        System.out.println(arr[0].length);// count the length of the array elements


        for (int i = 0; i<arr.length; i++){

            for (int j = 0; j<arr[i].length; j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

         //  sum of all elements in the array


        for (int i = 0; i<arr.length; i++){
            int sum = 0;
            int sum2 = 0;
            for (int j = 0; j<arr[i].length; j++){
                sum += arr [i][j];
                sum2 += arr[i][j];
            }
            System.out.println(sum);
            sum = 0;

        }

    }
}
