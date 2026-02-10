package AdvanceDSAMaster.Array;

import java.util.Scanner;

public class cup2012 {
    public static void main(String[] args) {
// n =  no of players
        // m =  position of player

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of players ");
        int n =  sc.nextInt();
        System.out.print("enter player position  ");
        int m =  sc.nextInt();
        System.out.print("enter  the scores ");
        int arr [] = new int[n];

//          input array (score)
        for (int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }


        int count = 0;
        for (int i = 0 ; i< n ; i++){
            if (arr[i] >= arr[m] && arr[i] > 0 ){
                count ++;
            }

        }

        System.out.println(count);


    }
}
