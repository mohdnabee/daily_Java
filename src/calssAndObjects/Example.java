package calssAndObjects;
// 22.	Create a class named Example inside the main method that declares a
// local variable num but does not assign any value to it. Try to print num and observe the output.
public class Example {



    public static void main(String[] args) {
        int num  ;


        System.out.println("value of num : "+num);
    }
}
// This code will result in a compilation error:


//error: variable num might not have been initialized
//        System.out.println("Num: " + num);
//                                    ^


//Explanation
//In Java, local variables (variables declared inside a method) do not have
// default values and must be initialized before use. Since we didn't assign any
// value to the num variable, the compiler prevents us from printing its value,
// resulting in an error.