import java.util.Scanner;

class Car {
    String brand;
    String model;
    float price;

    void display(String brand) {
        System.out.println("\n Car Details: ");
        System.out.println("Brand: " + brand);
    }

    void display(String brand, String model) {
        System.out.println("\n Car Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    void display(String brand, String model, float price) {
        System.out.println("\n Car Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

}

public class moudp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();

        System.out.print("Enter the brand of the car: ");
        String brand = sc.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = sc.nextLine();

        System.out.print("Enter the price of the car: $");
        float price = sc.nextFloat();

        c1.display(brand);
        c1.display(brand, model);
        c1.display(brand, model, price);

        sc.close();
    }

}
