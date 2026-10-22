import java.util.Scanner;

class Addition {
    int a;
    int b;
    int c;
    int d;

    Addition(int a, int b) {
        this.a = a;
        this.b = b;

    }

    Addition(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Addition(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

public class cowiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        System.out.print("Enter the fourth number: ");
        int d = sc.nextInt();

        Addition a1 = new Addition(a, b);
        Addition a2 = new Addition(a, b, c);
        Addition a3 = new Addition(a, b, c, d);

        System.out.println("\nAdding the first two gives us: " + a1.add(a, b));
        System.out.println("Adding the first three gives us:" + a2.add(a, b, c));
        System.out.println("Adding all of the numbers gives us: " + a3.add(a, b, c, d));

        sc.close();
    }
}
