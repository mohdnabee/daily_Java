package function;

import java.util.Scanner;

public class function3fac {
    // find the factorial of a number ||==========================//===============================//=============
// 4!= 4*3*2*1=  24|| n! =n(n-1)*n(n-2)*n(n-3)........*1
    // 5!= 5*4*3*2*1= 120 || using the loops to calculate numbers .................................



    // function to calculateFactorial
    public static void printFactorial(int n){
        // loop
        // condition of negative number
        if(n<0){
            System.out.println("Invalid number || Negative number ");
            return;
        }
        int factorial =1;
        for (int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;//  agar function me void a tho return ke bina bhi return ho jaya ga
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        // call the function
        printFactorial(n);

    }
}