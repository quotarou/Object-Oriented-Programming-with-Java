import java.util.Scanner;

class Vehicle {
    String brand;

    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;
    int price;

    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

}

public class singleinheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();

        System.out.println("Car Registration: ");

        System.out.print("Enter the brand of the car: ");
        c1.brand = sc.nextLine();

        System.out.print("Enter the model of the car: ");
        c1.model = sc.nextLine();

        System.out.print("Enter the price of the car: $");
        c1.price = sc.nextInt();

        c1.display();

        sc.close();
    }

}
