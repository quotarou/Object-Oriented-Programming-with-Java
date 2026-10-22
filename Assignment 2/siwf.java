import java.util.Scanner;

class Vehicle {
    String brand;

    void start() {
        System.out.println("\n" + brand + " is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("\n" + brand + " is driving.");
    }
}

public class siwf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c1 = new Car();

        System.out.print("Enter the brand of the car: ");
        c1.brand = sc.nextLine();

        c1.start();
        c1.drive();

        sc.close();
    }

}
