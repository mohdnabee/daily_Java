package methods;

import java.util.Scanner;

public class SquareofNumber {


    static void square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Square of a Number :" + num * num);
    }


    public  static  int Square1(int num){
        return  num * num ;
    }

    public static void main(String[] args) {
        square();

        // square 1
        int number = 5 ;
        int result = Square1(number);
        System.out.println("The Square of "+ number+ " is "+result);
    }
}


