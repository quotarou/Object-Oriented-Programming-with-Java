import java.util.Scanner;

class Car {
    String brand;
    String model;
    int price;

    Car(String brand, String model, int price) {
        this.brand = brand;
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

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, String model, int price, int batteryCapacity) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + "kWh");
    }
}

class PetrolCar extends Car {
    int mileage;

    PetrolCar(String brand, String model, int price, int mileage) {
        super(brand, model, price);
        this.mileage = mileage;
    }

    void display() {
        super.display();
        System.out.println("Mileage: " + mileage + "km per liter");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of the electric car: ");

        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Price: $");
        int price = sc.nextInt();

        System.out.print("Battery Capacity: ");
        int batteryCapacity = sc.nextInt();
        sc.nextLine();

        ElectricCar c1 = new ElectricCar(brand, model, price, batteryCapacity);

        System.out.println("\nEnter the details of the petrol car: ");

        System.out.print("Brand: ");
        String brand2 = sc.nextLine();

        System.out.print("Model: ");
        String model2 = sc.nextLine();

        System.out.print("Price: $");
        int price2 = sc.nextInt();

        System.out.print("Mileage: ");
        int mileage = sc.nextInt();

        PetrolCar c2 = new PetrolCar(brand2, model2, price2, mileage);

        c1.display();
        c2.display();

        sc.close();

    }

}
