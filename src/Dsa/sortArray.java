package Dsa;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {

        int [] array  =  {5,2,8,1,3,4,6,9};

        //  before sorting
        System.out.println("Original array : "+ Arrays.toString(array));

        //  sorting  array in ascending order
        Arrays.sort(array);

        //  After sorting  array
        System.out.println("Sorted array:"+Arrays.toString(array));

    }
}
