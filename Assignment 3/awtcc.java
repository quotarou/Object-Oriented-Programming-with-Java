import java.util.Scanner;

abstract class Car {
    String brand;
    String model;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    abstract void details();
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void details() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Capacity: " + batteryCapacity + "kWh");
    }
}

class PetrolCar extends Car {
    int mileage;

    PetrolCar(String brand, String model, int mileage) {
        super(brand, model);
        this.mileage = mileage;
    }

    @Override
    void details() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage + " per liter");
    }
}

public class awtcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Car Registration:");

        System.out.println("Car 1 (Electric)-");

        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Battery Capacity: ");
        int batteryCapacity = sc.nextInt();
        sc.nextLine();

        System.out.println("Car 2 (Petrol)-");

        System.out.print("Brand: ");
        String pbrand = sc.nextLine();

        System.out.print("Model: ");
        String pmodel = sc.nextLine();

        System.out.print("Mileage: ");
        int mileage = sc.nextInt();

        ElectricCar e1 = new ElectricCar(brand, model, batteryCapacity);
        PetrolCar p1 = new PetrolCar(pbrand, pmodel, mileage);

        e1.details();
        p1.details();

        sc.close();
    }

}
