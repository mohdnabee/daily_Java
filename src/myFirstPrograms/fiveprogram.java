package myFirstPrograms;

import java.util.*;

public class fiveprogram {

    public static void main (String [] arg) {

        // USERS INPUTS
//        Scanner sc = new Scanner(System.in);
        // next get a single token =  mohd nabeel  its take only Mohd
        // nextLine used to print a whole line like  = hello world  its print the hello world
//        String name = sc.nextLine();
        // nextInt() used to integer type print
        // nextFloat() used to floating type integer(number) print
        //nextDouble
        // nextLong
//        System.out.println(name);
        System.out.println("give the values of a and b ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;


        System.out.println("a is " + a + " a is "+b+  " sum of a and b  : "+ sum);
    }
}