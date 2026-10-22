import java.util.Scanner;

abstract class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    abstract void display();
}

class Car extends Vehicle {
    int price;
    int mileage;

    Car(String brand, String model, int price, int mileage) {
        super(brand, model);
        this.price = price;
        this.mileage = mileage;
    }

    @Override
    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + " per liter");
    }
}

class Bike extends Vehicle {
    int price;
    int engineCapacity;

    Bike(String brand, String model, int price, int engineCapacity) {
        super(brand, model);
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    @Override
    void display() {
        System.out.println("\nBike Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Engine Capacity: " + engineCapacity + " liters");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Car Registration:");

        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Price: $");
        int price = sc.nextInt();

        System.out.print("Mileage: ");
        int mileage = sc.nextInt();
        sc.nextLine();

        System.out.println("\nBike Registration:");

        System.out.print("Brand: ");
        String brand2 = sc.nextLine();

        System.out.print("Model: ");
        String model2 = sc.nextLine();

        System.out.print("Price: $");
        int price2 = sc.nextInt();

        System.out.print("Engine Capacity: ");
        int engineCapacity = sc.nextInt();

        Car c1 = new Car(brand, model, price, mileage);
        Bike b1 = new Bike(brand2, model2, price2, engineCapacity);

        c1.display();
        b1.display();

        sc.close();
    }
}
