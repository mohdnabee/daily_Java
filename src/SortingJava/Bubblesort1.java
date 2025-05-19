package SortingJava;

public class Bubblesort1 {

    // function to print an array
    public  static void PrintArray(int []arr){
        for (int i = 0  ; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void main(String[] args) {

        int [] arr =  {9 , 10,7  , 11 , 8, 4, 2, 1, 3 , 6,5 };

        for(int i  = 0;  i<arr.length; i++){
            for (int j =0 ; j<arr.length-i-1; j++){


                if (arr[j] >arr[j+1]){
                    // sawp

                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        PrintArray(arr);

    }
}
