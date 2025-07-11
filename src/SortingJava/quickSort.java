package SortingJava;

public class quickSort {

    // method 2 recursion
    public static int partion (int arr [],  int low , int high){
        int pivot =  arr[high];
        int i  =  low -1;

        for (int j  = low;  j<high; j++){
            if (arr [j] <pivot){
                i++;

                /// swap
            int temp  =  arr[i];
            arr[i]=  arr[j];
            arr[j]= temp;
            }
        }

        i++;
        int temp  =  arr[i];
        arr[high]=  temp;
      return i ;

    }


    // Method 1 recursion
    public  static  void QuickSort(int arr [],  int low , int high){

        if (low < high){
            int pidx =  partion(arr,low,high);

           QuickSort(arr, low ,pidx-1);
           QuickSort(arr, pidx+1,high);
        }

    }


    public static void main(String[] args) {

        int [] arr =  {6,3,9,5,2,8};
        int n = arr.length;
        System.out.println("Length of an array is : "+ n);

        QuickSort(arr , 0, n-1);
        for (int i  =  0;  i<n ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
}
