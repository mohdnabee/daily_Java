package calssAndObjects;
//10.	Create a class named Laptop with instance variables brand, ram, and storage.
// Create 3 objects and assign values to each. Print the details of all laptops.

public class Laptop {

    String brand;
    int ram;
    int storage;

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.brand = "Asus";
        laptop1.ram = 16;
        laptop1.storage = 512;

        Laptop laptop2 = new Laptop();
        laptop2.brand = "HP";
        laptop2.ram = 8;
        laptop2.storage = 512;

        Laptop laptop3 = new Laptop();
        laptop3.brand = "Lenovo";
        laptop3.ram = 16;
        laptop3.storage = 1;

        System.out.println("Laptop 1 details:");
        System.out.println("Brand: " + laptop1.brand);
        System.out.println("RAM: " + laptop1.ram + " GB");
        System.out.println("Storage: " + laptop1.storage + " GB");

        System.out.println("\nLaptop 2 details:");
        System.out.println("Brand: " + laptop2.brand);
        System.out.println("RAM: " + laptop2.ram + " GB");
        System.out.println("Storage: " + laptop2.storage + " GB");

        System.out.println("\nLaptop 3 details:");
        System.out.println("Brand: " + laptop3.brand);
        System.out.println("RAM: " + laptop3.ram + " GB");
        System.out.println("Storage: " + laptop3.storage + " TB");
    }

}
