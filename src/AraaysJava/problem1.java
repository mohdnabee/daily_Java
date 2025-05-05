package AraaysJava;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

      //   Take an array of names as input from the user and print them on the screen.

        // get a size of an array as a user
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array");
        int size = sc.nextInt();

        System.out.print("enter the name :-");
        //  take a name as user input
        String []name = new String[size];

        // input of an array using loop

        for (int i =0; i<size;i++){
            name [i]= sc.next();
        }

        // output of an array

        for (int i =0 ; i<size;i++){
            System.out.println("name " + (i+1) +" is : " + name[i]);
        }



    }
}
