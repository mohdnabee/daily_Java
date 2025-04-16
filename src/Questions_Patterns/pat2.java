package Questions_Patterns;

import java.util.Scanner;

public class pat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern....!!!");
        char ch;

        for (int i = 1; i <= rows; i++)
        {
            ch = 'A';

            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
