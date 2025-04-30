package function;

import java.util.Scanner;

//Make a function to check if a given number n is even or not.===============//=========================================
public class fuction5checkeven {

    public  static void checkNum(int num){

        if (num %2 == 0){   //  using a module operator || if the condition is true===============//====================
            System.out.println("Its even ");

        }else {//  else the condition is false ====================//===================================================
            System.out.println("its odd number ");
        }
    }

//==========================//===============================//===================================//====================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int num = sc.nextInt();


       checkNum(num);//  call the function ===========================//================================================

    }
}
