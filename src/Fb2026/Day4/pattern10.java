package Fb2026.Day4;

public class pattern10 {
    public static void main(String[] args) {
//         Solid Rhombus

        int n= 5 ;

       for ( int i = 1; i<=n ; i++){
//             spaces

           for ( int j = 1; j<=n-i ; j++){
               System.out.print(" ");
           }

           for (int j =1 ; j<=n ; j++){
               System.out.print("*");
           }
           System.out.println();
       }


    }
}
