package AdvanceDSAMaster;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();  //  no  of friends
        int h =  sc.nextInt(); //  height


        int total  = 0 ;

        for (int i=0;  i<n ; i++){

            int height= sc.nextInt();

            if(height >h ){
                total =  total +2;
            } else
                total =  total +1;

        }
        System.out.println(total);


    }
}
