package function.exercise1Java;

// write a function that takes in the radius  as  input and returns of circumference of a circle

import java.util.Scanner;

public class circumferenceOFACircle {

    // function
    public static double Circumference(double radius){
        //  Circumference = 2 × π × radius

       double circumference = 2 * 3.14 *radius;
       return  circumference;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = sc.nextDouble();



        System.out.println("Circumference of a Circle  is : "+Circumference(radius));


    }
}
