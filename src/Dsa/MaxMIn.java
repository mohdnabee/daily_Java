package Dsa;

public class MaxMIn {
    public static void main(String[] args) {

        int []array  =  {100,200,30,50,10,20,60};
        int max =  array[0];
        int min  =  array[0];


        //  print the array  elements ;
        System.out.print("array elements :  ");
        for (int number :  array){
            System.out.print(number+" ");
        }


        //  find a max
        for (int maxNumber :  array){
            if (maxNumber >  max){
              max = maxNumber;
            }
        }

        //  find a min
        for (int minNumber :  array){
            if (minNumber <  min){
                min =  minNumber;
            }
        }
        //  size of an array
        System.out.println("\nSize of an array is :" +array.length);
        System.out.println("Max number of an array : "+max);
        System.out.println("Min number of an array : "+min);


    }
}
