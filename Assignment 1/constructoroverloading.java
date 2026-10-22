import java.util.Scanner;

class Car {
    String brand;
    String model;
    float price;

    Car(String brand) {
        this.brand = brand;
    }

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    Car(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayall() {
        System.out.println("\n Car Details: \n");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

public class constructoroverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the brand of the car: ");
        String brand = sc.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = sc.nextLine();

        System.out.print("Enter the price of the car: $");
        float price = sc.nextFloat();

        Car c1 = new Car(brand);
        Car c2 = new Car(brand, model);
        Car c3 = new Car(brand, model, price);

        c1.displayall();
        c2.displayall();
        c3.displayall();

        sc.close();
    }
}
