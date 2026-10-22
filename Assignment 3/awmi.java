import java.util.Scanner;

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void display();
}

abstract class Car extends Vehicle {
    String model;
    int price;

    Car(String brand, String model, int price) {
        super(brand);
        this.model = model;
        this.price = price;
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

public class awmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Car Registration:");

        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Price: $");
        int price = sc.nextInt();

        System.out.print("Battery Capacity: ");
        int batteryCapacity = sc.nextInt();

        ElectricCar e1 = new ElectricCar(brand, model, price, batteryCapacity);
        e1.display();

        sc.close();
    }

}
