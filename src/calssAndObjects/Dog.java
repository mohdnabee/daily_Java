package calssAndObjects;
//6.	Create a class named Dog with an instance variable name.
// Create 3 objects of this class and assign different names to each. Print the names.
public class Dog {
    String name ;

    public static void main(String[] args) {

        Dog dog1 =  new Dog();
        dog1.name= "max";

        Dog dog2 = new Dog();
        dog2.name= "alex";

        Dog dog3 =  new Dog();
        dog3.name = "Rock";

        System.out.println("Dog 1 name: " + dog1.name);
        System.out.println("Dog 2 name: " + dog2.name);
        System.out.println("Dog 3 name: " + dog3.name);

      }
}
