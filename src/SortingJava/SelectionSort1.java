package SortingJava;

public class SelectionSort1 {
    public static void arrayPrint(int [] arr) {
        for (int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int [] arr =  {7,6 , 5,4 , 3, 2, 1, 8, 9 , 0};


        for (int i =0;  i<arr.length-1; i++){

            int smallest =  i;
            for (int j =i+1;  j<arr.length; j++){
                if (arr[smallest] >arr[j]){
                    smallest= j;
                }
            }

            // swap
            int temp =  arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= temp;
        }
        arrayPrint(arr);
    }
}
