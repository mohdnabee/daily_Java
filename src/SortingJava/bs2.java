package SortingJava;

public class bs2 {


    // function to print an array
    public static void printArr(int [] arr){

        for (int i =0;  i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }


    public static void main(String[] args) {


        int [] arr =  { 1 , 3 , 10 , 5 , 4 , 100 , 60 , 50 , 40 , 30 , 4 , 78 , 55 };

        for ( int i = 0 ; i<arr.length; i++){

            for (int j = 0;  j<arr.length-i-1;  j++){
                if (arr[j]>arr[j+1]){

                    //  swap
                    int temp =  arr[j];
                    arr[j]=  arr[j+1];
                    arr[j+1]=  temp;

                }
            }
        }
        System.out.print("Bubble Sort  Array : ");
        printArr(arr);
    }
}
