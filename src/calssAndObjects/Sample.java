package calssAndObjects;
//23.	Create a class named Sample with an instance variable data.
// Create an object and print the value of data without initializing it. Observe the output.

public class Sample {
    int data;

    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println("Data: " + sample.data);

    }
}
