package AraaysJava.array2D;

public class maxandMinn2Daaray {

    public static void main(String[] args) {

        int [] [] arr = {{1,2,3,4}, {2,4,9,8}, {5,6,8,11}};

        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i<arr.length; i++){

            for (int j = 0; j<arr[i].length; j++){
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
                if (arr[i][j]<min){
                    min = arr[i][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("max "+max);
            max = 0;
            System.out.println(" min "+ min );
            min= 0;
        }

        // min
//        System.out.println("min "+min);
//        min = 0;
    }
}
