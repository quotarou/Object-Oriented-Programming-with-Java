import java.util.Scanner;

abstract class Vehicle {
    int price;
    int tax;

    Vehicle(int price, int tax) {
        this.price = price;
        this.tax = tax;
    }

    abstract void calculateCost();
}

class Car extends Vehicle {
    Car(int price, int tax) {
        super(price, tax);
    }

    @Override
    void calculateCost() {
        System.out.println("Total Cost (Car): $" + (price + tax));
    }
}

class Bike extends Vehicle {
    Bike(int price, int tax) {
        super(price, tax);
    }

    @Override
    void calculateCost() {
        System.out.println("\nTotal Cost (Bike): $" + (price + tax));
    }
}

public class awmo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Purchase Cost Calculator:");

        System.out.println("\nCar:");

        System.out.print("Price: $");
        int cprice = sc.nextInt();

        System.out.print("Tax: $");
        int ctax = sc.nextInt();

        System.out.println("\nBike:");

        System.out.print("Price: $");
        int bprice = sc.nextInt();

        System.out.print("Tax: $");
        int btax = sc.nextInt();

        Car c1 = new Car(cprice, ctax);
        Bike b1 = new Bike(bprice, btax);

        c1.calculateCost();
        b1.calculateCost();

        sc.close();
    }

}
