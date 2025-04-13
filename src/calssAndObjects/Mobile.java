package calssAndObjects;
//7.	Create a class named Mobile with instance variables brand and model.
// Create 2 objects and assign different values to each. Print the details of both mobiles.
public class Mobile {
    String brand;
    String model;

    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.model = "iPhone 14";

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.model = "Galaxy S22";

        Mobile mobile3 =  new Mobile();
        mobile3.brand = "Realme";
        mobile3.model= "8 pro";

        Mobile mobile4 =  new Mobile();
        mobile4.brand= "Vivo";
        mobile4.model= "Y15";

        System.out.println("Mobile 1 details:");
        System.out.println("Brand: " + mobile1.brand);
        System.out.println("Model: " + mobile1.model);

        System.out.println("\nMobile 2 details:");
        System.out.println("Brand: " + mobile2.brand);
        System.out.println("Model: " + mobile2.model);

        System.out.println("\nMobile 3 details:");
        System.out.println("Brand: " + mobile3.brand);
        System.out.println("Model: " + mobile3.model);

        System.out.println("\nMobile 4 details: ");
        System.out.println("Brand: "+mobile4.brand);
        System.out.println("Model : "+mobile4.model);
    }
}


