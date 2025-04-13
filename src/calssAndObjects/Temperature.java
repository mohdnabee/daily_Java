package calssAndObjects;
// 19.	Create a class named Temperature inside the main method that declares
// a local variable celsius and prints the converted temperature
public class Temperature {

    public static void main(String[] args) {
        double celsius = 30;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
       }
}
