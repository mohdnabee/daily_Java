package function;

import java.util.Scanner;

public class fun1 {

    // declare of function || returnType functionName (type arg1, type arg2...)

    public static  void  printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        String name = sc.next();

        printMyName(name);// call kiya function ko =============//=====================//======================//======||================||============================+++
    }
}
// print a given name in a function || date: 30-04-25 ||  day: wednesday=====//====================//============//=====||================================================