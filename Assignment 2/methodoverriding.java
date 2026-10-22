import java.util.Scanner;

class Car {
    String brand;

    void display() {
        System.out.println("\n" + brand + " is a vehicle.");
    }
}

class PetrolCar extends Car {
    void display() {
        System.out.println("\n" + brand + " is a petrol car.");
    }
}

class ElectricCar extends Car {
    void display() {
        System.out.println("\n" + brand + " is an electric car.");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c1;

        System.out.print("Enter the brand of the car: ");
        String brand = sc.nextLine();

        System.out.print("Enter the type of the car (Electric/Petrol): ");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase("electric")) {
            c1 = new ElectricCar();
        } else {
            c1 = new PetrolCar();
        }

        c1.brand = brand;
        c1.display();

        sc.close();
    }

}
