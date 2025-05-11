package String;

import java.util.Scanner;

public class stringConcatenation {
    public static void main(String[] args) {

        // concatenation means  2 string  ko join kar na

        String firstName =  "Mohd";
        String lastName =  "Nabeel";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);


        //  user inputs

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name : ");
//        String name  = sc.next();//  its take only one word ex => Input : Mohd Nabeel || output Mohd
//
//        System.out.println(name );

        //  using a nextLine to print a full string
        System.out.print("enter the name : ");
        String name2 = sc.nextLine();
        System.out.println(name2);

    }
}
