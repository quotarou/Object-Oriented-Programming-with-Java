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

    Car(String brand, String model, int price) {
        super(brand, model);
        this.price = price;
    }

    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

public class acwc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Car Registration:");

        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Price: $");
        int price = sc.nextInt();

        Car c1 = new Car(brand, model, price);
        c1.display();

        sc.close();
    }

}
