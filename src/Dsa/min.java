package Dsa;

public class min {
    public static void main(String[] args) {

        int []arr=  {10,23,5,15,16};
        int min =  arr[0];

        for (int array   : arr){
            if (array <min ){
                min =  array;
            }
        }

        System.out.println("Minimum value of array : "+ min);

    }
}
