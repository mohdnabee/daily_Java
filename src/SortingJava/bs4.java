package SortingJava;

public class bs4 {


    public static  void  printArray(int [] arr){
        for (int i =  0 ;  i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int []  arr =  {1 , 4 , 10 , 100 , 20 , 50 , 30 , 70 ,55, 45 , 95  , 56 , 67};

        for (int i  =  0 ;  i< arr.length; i++){
            for (int j = 0 ; j<arr.length-i-1; j++){

                if (arr[j]>arr[j+1]){

                    int temp  = arr[j];
                     arr[j] =  arr[j+1];
                     arr[j+1] = temp;
                }
            }
        }
        System.out.print("sorted Array : ");
        printArray(arr);

        System.out.println("\nExample of Bubble Sort || 19-05-2025 || Monday....");
    }
}
