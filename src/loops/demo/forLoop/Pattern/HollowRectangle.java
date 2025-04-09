package loops.demo.forLoop.Pattern;

public class HollowRectangle {
    public static void main(String[] args) {

        System.out.println("Hollow Rectangle");

        // rows = outer loop
        // columns = inner loop

        int n=  5;
        int m= 10;

        // outer loop
        for (int i = 1; i<=n;i++){
            //inner loop

            for (int j = 1 ; j<=m ; j++){
                // cell -> (i,j)
                if(i == 1 || j == 1 || i ==n || j==m ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
