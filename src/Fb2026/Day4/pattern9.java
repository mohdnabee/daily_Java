package Fb2026.Day4;

public class pattern9 {
    public static void main(String[] args) {
//          0-1 triangle

        int n = 5 ;

        for (int i =1 ;  i<=n ; i++){
            for (int j =1; j<=i ; j++){
                int sum =  i+j;
                if (sum %2 == 0){//  even
                    System.out.print(1+" ");
                }else { // odd
                    System.out.print(0+" ");
                }

            }
            System.out.println();
        }

    }
}
