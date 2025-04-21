package loops.demo.forLoop.Pattern;

public class Kshape {
    public static void main(String[] args) {

        int rows = 5 ;
        char ch;

        for (int i = rows; i >= 1; i--)
        {
            ch = 'A';
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }

            int  spaces  = 2*(rows-i);
            for (int j =1 ; j<=spaces; j++){
                System.out.print(" ");
            }

                for (int j = 5; j >= i; j--) {
                    System.out.print("A");
            }
            System.out.println();

            }
        }
    }
