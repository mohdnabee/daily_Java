package Fb2026.Day4;

public class pattern4 {
    public static void main(String[] args) {

//          inverted half Pyramid

        int n =5 ;

        for (int i=n;  i>=1 ; i--){

            for (int j = 1 ; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
