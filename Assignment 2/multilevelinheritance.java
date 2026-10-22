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

class SportsCar extends Car {
    int topSpeed;

    SportsCar(String brand, String model, int price, int topSpeed) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
    }

    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Top Speed: " + topSpeed + "km/h");
    }

}

public class multilevelinheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Car Registration:");

        System.out.print("Enter the brand of the car: ");
        String brand = sc.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = sc.nextLine();

        System.out.print("Enter the price of the car: $");
        int price = sc.nextInt();

        System.out.print("Enter the top speed of the car: ");
        int topSpeed = sc.nextInt();

        SportsCar c1 = new SportsCar(brand, model, price, topSpeed);

        c1.display();

        sc.close();
    }

}
