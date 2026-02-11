package Fb2026.Day4;

public class pattern12 {
//      palindromic number prayid

    public static void main(String[] args) {
        int n =5 ;

        for (int i =1 ;  i <=n ; i++){

//              spaces
            for ( int j =1 ; j<=n-i ; j++){
                System.out.print("  ");
            }

            for ( int j =i ;  j>= 2 ; j-- ){
                System.out.print(j+" ");
            }

            for ( int j =1 ; j <=i ; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }




}
