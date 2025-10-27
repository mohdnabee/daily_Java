import java.util.*;

class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String sellerName;
    private boolean sold;

    public Car(String brand, String model, int year, double price, String sellerName) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.sellerName = sellerName;
        this.sold = false;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getSellerName() { return sellerName; }
    public boolean isSold() { return sold; }

    public void setPrice(double newPrice) { this.price = newPrice; }
    public void markSold() { this.sold = true; }

    public void showDetails() {
        System.out.println("\n------ Car Inspection ------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: ₹" + price);
        System.out.println("Seller: " + sellerName);
        System.out.println("Status: " + (sold ? "Sold" : "Available"));
        System.out.println("----------------------------\n");
    }
}

public class CarMarket {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("========== Welcome to AutoDeal Car Market ==========");
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Sell a Car");
            System.out.println("2. View All Cars");
            System.out.println("3. Inspect a Car");
            System.out.println("4. Bargain Price");
            System.out.println("5. Buy a Car");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> sellCar();
                case 2 -> viewCars();
                case 3 -> inspectCar();
                case 4 -> bargainCar();
                case 5 -> buyCar();
                case 6 -> {
                    System.out.println("Thank you for using AutoDeal! 🚗");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void sellCar() {
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter manufacturing year: ");
        int year = scanner.nextInt();
        System.out.print("Enter selling price: ₹");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String sellerName = scanner.nextLine();

        cars.add(new Car(brand, model, year, price, sellerName));
        System.out.println("✅ Car added for sale successfully!");
    }

    private static void viewCars() {
        System.out.println("\n------ Available Cars ------");
        if (cars.isEmpty()) {
            System.out.println("No cars available right now.");
            return;
        }
        int index = 1;
        for (Car car : cars) {
            if (!car.isSold()) {
                System.out.println(index++ + ". " + car.getBrand() + " " + car.getModel() + " (" + car.getYear() + ") - ₹" + car.getPrice());
            }
        }
        System.out.println("-----------------------------");
    }

    private static void inspectCar() {
        viewCars();
        System.out.print("Enter the number of the car to inspect: ");
        int index = scanner.nextInt();
        if (index > 0 && index <= cars.size()) {
            cars.get(index - 1).showDetails();
        } else {
            System.out.println("❌ Invalid car number.");
        }
    }

    private static void bargainCar() {
        viewCars();
        System.out.print("Enter the number of the car to bargain: ");
        int index = scanner.nextInt();
        if (index > 0 && index <= cars.size()) {
            Car car = cars.get(index - 1);
            if (car.isSold()) {
                System.out.println("❌ This car has already been sold.");
                return;
            }
            System.out.print("Enter your offer price: ₹");
            double offer = scanner.nextDouble();

            if (offer >= car.getPrice() * 0.9) {
                System.out.println("🎉 Deal accepted! Seller agrees to ₹" + offer);
                car.setPrice(offer);
            } else {
                System.out.println("⚠️ Offer too low. Seller rejected the bargain.");
            }
        } else {
            System.out.println("❌ Invalid car number.");
        }
    }

    private static void buyCar() {
        viewCars();
        System.out.print("Enter the number of the car you want to buy: ");
        int index = scanner.nextInt();
        if (index > 0 && index <= cars.size()) {
            Car car = cars.get(index - 1);
            if (car.isSold()) {
                System.out.println("❌ This car is already sold.");
                return;
            }
            car.markSold();
            System.out.println("✅ You successfully bought the " + car.getBrand() + " " + car.getModel() + " for ₹" + car.getPrice());
        } else {
            System.out.println("❌ Invalid car number.");
        }
    }
}
