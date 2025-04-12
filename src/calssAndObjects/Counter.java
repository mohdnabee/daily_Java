package calssAndObjects;
//11.	Create a class named Counter with a static variable count.
// Increment this variable every time an object is created. Print the count after creating 3 objects.
public class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println("Count: " + Counter.count);

    }
}



