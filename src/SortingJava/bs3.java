package SortingJava;

public class bs3 {

    public static  void printArry(int arr []){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr [] =  { 10 , 9 , 8, 7, 6, 5,4 ,3, 2,1 ,0};

        for (int i = 0 ;  i<arr.length; i++){
            for (int j = 0 ;  j<arr.length-i-1;  j++){
                if (arr[j]>arr[j+1]){
                    // swap the value
                    int temp  =  arr[j];
                    arr[j]=  arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

        printArry(arr);
    }
}
