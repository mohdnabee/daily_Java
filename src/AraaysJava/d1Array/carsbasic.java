package AraaysJava.d1Array;

public class carsbasic {

    public static void main(String[] args) {

        //  syntax of an array is == String []  Car =  {"BMW", "AUDI", "FORD", "SCORPIO"}

        // syntax of an interger array is ==> int []  Car =  {10 ,20 ,30 , 40 , 50}


        //Access the elements of an array
        System.out.println("Access the elements of an array");
        String [] cars = {"BWM", "AUDI", "FORD", "SCORPIO"};
        System.out.println(cars[0]);


        //  change the array elements
        System.out.println("Change the array elements");
//        String [] cars= {"BWM", "AUDI", "FORD", "SCORPIO"};
        cars[0]= "RANGE ROVER";
        System.out.println(cars[0]);


        //  Array length
       //  String [] cars = {"BWM", "AUDI", "FORD", "SCORPIO"};
        System.out.println("Array length : "+cars.length);
    }
}
