package calssAndObjects;
// 20.	Create a class named Test with an instance variable value.
// Create an object and try to print the value without assigning any value to it. Observe the output
public class Test {

    int value;

    public static void main(String[] args) {

        Test test = new Test() ;

        System.out.println( "Value: " + test.value);
    }
}
