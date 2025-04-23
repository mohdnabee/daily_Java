package AraaysJava;

public class Arrayloop {
    public static void main(String[] args) {
        // you can loop through the array elements with the for loop , and use the length property to specify
        // how many times the loop should run ;
        //  example outputs all elements in the case array :

        String [] cars =  {"BMW", "AUDI","SCORPIO","fORD"};

        //  using the for loop
        System.out.println(" using the for loop");
        for ( int i =0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        //  loop through an Array with For-Each
        System.out.println();
        System.out.println(" loop through an Array with For-Each");

        for (String k : cars){
            System.out.println(k);
        }

  /** note :-> The example above can be read like this: for each String element (called i - as in index) in cars,
        // print out the value of i.

        //If you compare the for loop and for-each loop, you will see that the for-each method is easier to write,
        // it does not require a counter (using the length property), and it is more readable.
*/
    }
}
