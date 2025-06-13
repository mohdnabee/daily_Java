package AraaysJava.d1Array;

public class sum2aary {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7};
        int [] arr2 = {1,2,3,4,5,6,7};
        int [] sum= new int[arr1.length];

        for (int i = 0; i<arr1.length; i++){
            sum[i] = arr1[i]+arr2[i];
        }
        for (int j = 0; j<7;j++){
            System.out.print(sum[j]+" ");
        }
    }
}
