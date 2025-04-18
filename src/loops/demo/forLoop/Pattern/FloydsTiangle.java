package loops.demo.forLoop.Pattern;

public class FloydsTiangle {
    public static void main(String[] args) {

        int n = 5;
        int number = 1 ;
        System.out.println("Floyd's Triangle");

        for (int i = 1;  i<=n ; i++){

            for (int j = 1 ; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

    }
}
