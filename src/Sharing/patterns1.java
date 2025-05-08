package Sharing;

public class patterns1 {
    public  void  pat (int  n){
        System.out.println();

        //  upper half
        for (int i = 1 ; i<=n; i++){

            // print a
            for (int j=n ;  j>=i ;  j--){
                System.out.print("*");
            }
            //  spaces
            for (int j=2 ;  j<i*2; j++){
                System.out.print(" ");
            }
            for (int j =n ;  j>=i; j--){
                System.out.print("*");
            }

            System.out.println();
        }

        //  second half
        for (int i = n-1 ; i>=1; i--){

            // print a
            for (int j=n ;  j>=i ;  j--){
                System.out.print("*");
            }
            //  spaces
            for (int j=2 ;  j<i*2; j++){
                System.out.print(" ");
            }
            for (int j =n ;  j>=i; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
