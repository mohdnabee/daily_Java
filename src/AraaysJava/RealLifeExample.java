package AraaysJava;

public class RealLifeExample {
    public static void main(String[] args) {
   // To demonstrate a practical example of using arrays, let's create a program that calculates the average of different ages:

//  An array storing different ages
        int[] ages  = { 20, 22, 18, 35 ,  48 , 26 ,  87 , 70};
        float avg, sum =0;

        //  get the length of the array
        int length =  ages.length;

        // loop through the elements of the array
        for (int age : ages){
            sum += age;
        }

        //  Calculate the average by dividing the sum by length

        avg = sum/length;

        //  print the average
        System.out.println("The average age is : "+ avg);


        System.out.println();


        // -------------------------------------------------------------------------------------------------------------
        // we create a program that finds the lowest age among different ages:

        System.out.println("lowest age");
        // An array storing different ages
        int ages1[] = {20, 22, 18, 35, 48, 26, 87, 70};

// Get the length of the array
        int length1 = ages1.length;

// Create a 'lowest age' variable and assign the first array element of ages to it
        int lowestAge = ages1[0];

// Loop through the elements of the ages array to find the lowest age
        for (int age2 : ages1) {
            // Check if the current age is smaller than the current 'lowest age'
            if (lowestAge > age2) {
                // If the smaller age is found, update 'lowest age' with that element
                lowestAge = age2;
            }
        }

// Output the value of the lowest age
        System.out.println("The lowest age in the array is: " + lowestAge);


    }
}
