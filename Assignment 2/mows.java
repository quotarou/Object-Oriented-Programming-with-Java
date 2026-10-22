import java.util.Scanner;

class Car {
    String brand;
    String model;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class SportsCar extends Car {
    int topSpeed;

    SportsCar(String brand, String model, int topSpeed) {
        super(brand, model);
        this.topSpeed = topSpeed;
    }

    void display() {
        super.display();
        System.out.println("Top speed: " + topSpeed + "km/h");
    }
}

public class mows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Car Registration:");

        System.out.print("Enter the brand of the car: ");
        String brand = sc.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = sc.nextLine();

        System.out.print("Enter the top speed of the car: ");
        int topSpeed = sc.nextInt();

        SportsCar c1 = new SportsCar(brand, model, topSpeed);

        c1.display();

        sc.close();
    }
}
