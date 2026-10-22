import java.util.Scanner;

class Calculator {
    int a;
    int b;
    int c;
    int d;

    int calculate(int a, int b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }

    int calculate(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator c1 = new Calculator();

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        System.out.print("Enter the fourth number: ");
        int d = sc.nextInt();

        System.out.println("\nAdding the first two gives us: " + c1.calculate(a, b));
        System.out.println("Adding the first three gives us:" + c1.calculate(a, b, c));
        System.out.println("Adding all of the numbers gives us: " + c1.calculate(a, b, c, d));

        sc.close();
    }
}
