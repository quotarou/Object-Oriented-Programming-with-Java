import java.util.Scanner;

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("\nBrand: " + brand);
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
        super.display();
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(String brand, int loadCapacity) {
        super(brand);
        this.loadCapacity = loadCapacity;
    }

    void display() {
        super.display();
        System.out.println("Load capacity: " + loadCapacity + " tonnes");
    }
}

public class hiwc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of the car:");

        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Price: $");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter the details of the truck:");

        System.out.print("Brand: ");
        String otherbrand = sc.nextLine();

        System.out.print("Load Capacity: ");
        int loadCapacity = sc.nextInt();

        Car c1 = new Car(brand, model, price);
        Truck t1 = new Truck(otherbrand, loadCapacity);

        c1.display();
        t1.display();

        sc.close();
    }

}
