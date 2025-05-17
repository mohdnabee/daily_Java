package bit_Manipulation;

import java.util.Scanner;

public class bit_ManipulationUpdateBit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int oper = sc.nextInt();
        //  oper =1 :  set  oper = 0 :  clear
        int  n= 5 ; // 0101
        int pos =  1;

       //  int oper =1 ; //  update bit to 1 else update bit 1 to 0
        int bitMask =1<<pos;
        if (oper  == 1 ){
            //  set
            int newNumber =  bitMask | n;
            System.out.println(newNumber);
        }else {
            // clear
            int newBitMask =  ~(bitMask);
            int newNumber =  newBitMask & n;
            System.out.println(newNumber);
        }



    }
}
