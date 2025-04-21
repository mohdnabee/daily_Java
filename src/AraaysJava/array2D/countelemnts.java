package AraaysJava.array2D;

public class countelemnts {
    public static void main(String[] args) {
        int total = 0;
        int z =0;
        int [][] arr =  { {1,3,4}, {2,4,6}, {3,4,6}};
        int [] arr1=new int[total];



        for (int i =0; i<arr.length;i++) {
            total += arr[i].length;
        }

        for (int k =0; k<arr.length; k++){
            for (int j =0; j<arr[k].length;j++){
                arr1[z]= arr[k][j];
                z++;
            }
        }

        for (int f = 0 ; f<arr1.length; f++){
            System.out.println();
        }
    }
}
