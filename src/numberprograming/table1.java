package numberprograming;

import java.util.Scanner;

public class table1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int table =  sc.nextInt();

        //  table formula
        for (int i = 1;i<=10; i++ ){
            System.out.println(table + "X"+ (i)+"="+ table*i);
        }

        // Square of the number
        System.out.println("Square of the number: " + (table * table));

        //  cube of n is
        System.out.println("Cube of number is : "+(table *  table * table));



        // Sum of first n natural numbers
        int sum = (table * (table + 1)) / 2;//  dry run 3 *(3 +1) / 2 =  3 *4/2
        System.out.println("Sum of first " + table + " natural numbers: " + sum);

        //  even or odd check
        if (table % 2 ==  0 ){
            System.out.println(table +" is even number ");
        }else {
            System.out.println(table+ "is odd number ");
        }

        //  factorial number of the number is

        int fact =1 ;
        for (int i =1; i<= table; i++){
            fact*=i;
        }

        System.out.println("Factorial of "+ table + "is : "+ fact);

        // revers of numbers
        System.out.print("Revers of Number is : ");

        for (int i = table ;  i>=1; i--){
            System.out.print(i+ " ");
        }

    }
}
