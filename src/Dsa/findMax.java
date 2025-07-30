package Dsa;

public class findMax {

    public static void main(String[] args) {

        int []arr =  {12,45,56,17};
        int max =arr[0];

        for (int  array  :  arr){
            if (array >  max){
                max = array;
            }
        }

        System.out.println("Maximum number in array is : "+ max);

    }

}
