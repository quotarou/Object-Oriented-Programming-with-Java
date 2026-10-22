import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area(int length, int breadth) {
        return length * breadth;

    }

    int area(int length) {
        return length * length;
    }
}

public class camt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();

        Rectangle r1 = new Rectangle(length, breadth);

        System.out.println("\nThe area (with length and breadth) is: " + r1.area(length, breadth));
        System.out.println("The area (with only length) is: " + r1.area(length));

        sc.close();

    }

}
