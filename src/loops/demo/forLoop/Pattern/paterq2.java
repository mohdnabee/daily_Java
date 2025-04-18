package loops.demo.forLoop.Pattern;

public class paterq2 {
    public static void main(String[] args) {
       //  Print a number pyramid.

        System.out.println("Print a number pyramid.");

        int n = 5 ;


        for (int i = 1 ;  i <= n ;  i++){

            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j =1 ;  j<=i; j++ ){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
