abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void startEngine();

    public void honk() {
        System.out.println(brand + " says: Beep Beep!");
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("You started doing burnouts.");
    }
}

class electricScooter extends Vehicle {
    public electricScooter(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("You started going really fast for no reason D:");
    }
}


public class caroperation {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Jaaaaaaag");
        Vehicle myElectricScooter = new electricScooter("top 10 electric scoot");

        myCar.startEngine();
        myCar.honk();

        //myElectricScooter.startEngine();
        //myElectricScooter.honk();
    }
}
