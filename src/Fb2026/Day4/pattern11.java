package Fb2026.Day4;

public class pattern11 {
    public static void main(String[] args) {
//          print a number pyramid

        int n =5 ;

        for (int i =1 ;  i<=n ; i++){

//              spaces
            for (int j =1; j<=n-i ; j++){
                System.out.print(" ");
            }

            for ( int k =1 ; k<= i ; k++){
                System.out.print(i+" ");
            }

            System.out.println();
        }

    }
}
