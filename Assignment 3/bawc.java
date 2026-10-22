import java.util.Scanner;

abstract class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    abstract void display();
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int batteryCapacity) {
        super(brand);
        this.batteryCapacity = batteryCapacity;
    }

    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Battery Capacity: " + batteryCapacity + "kWh");
    }
}

public class bawc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Car Registration:");

        System.out.print("Brand: ");
        String brand = sc.nextLine();

        System.out.print("Battery Capacity: ");
        int batteryCapacity = sc.nextInt();

        ElectricCar e1 = new ElectricCar(brand, batteryCapacity);
        e1.display();

        sc.close();
    }

}
