package loops.demo.forLoop;

import java.util.*;

public class Question1 {

    public static void main(String[] args) {
        //Print all even numbers till n

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i= 2; i<=a; i= i+2){
            System.out.println(i);
        }

    }
}
