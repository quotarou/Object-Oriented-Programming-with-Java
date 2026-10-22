import java.util.Scanner;

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;
    int price;

    Car(String brand, String model, int price) {
        super(brand);
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, String model, int price, int batteryCapacity) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Battery Capacity: " + batteryCapacity + "kWh");
    }

}

public class miws {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Car Registration:");

        System.out.print("Enter the brand of the car: ");
        String brand = sc.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = sc.nextLine();

        System.out.print("Enter the price of the car: $");
        int price = sc.nextInt();

        System.out.print("Enter the battery capacity of the car: ");
        int batteryCapacity = sc.nextInt();

        ElectricCar c1 = new ElectricCar(brand, model, price, batteryCapacity);

        c1.display();

        sc.close();
    }

}
