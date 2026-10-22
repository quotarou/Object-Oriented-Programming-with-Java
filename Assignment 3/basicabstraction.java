import java.util.Scanner;

abstract class Shape {
    int length;
    int breadth;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    abstract void area(int length, int breadth);
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void area(int length, int breadth) {
        System.out.println("\nThe area is: " + (length * breadth) + "m");
    }
}

public class basicabstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Area Calculator:");

        System.out.print("Enter the length: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();

        Rectangle r1 = new Rectangle(length, breadth);
        r1.area(length, breadth);

        sc.close();
    }

}
