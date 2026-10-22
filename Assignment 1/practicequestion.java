import java.util.Scanner;

class Employee {
    String name;
    int id;
    int salary;

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display(String name) {
        System.out.println("\nEmployee Details: ");
        System.out.println("Name:" + name);
    }

    void display(String name, int id) {
        System.out.println("\nEmployee Details: ");
        System.out.println("Name:" + name);
        System.out.println("ID: " + id);
    }

    void display(String name, int id, int salary) {
        System.out.println("\nEmployee Details: ");
        System.out.println("Name:" + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

public class practicequestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your ID: ");
        int id = sc.nextInt();

        System.out.print("Enter your salary: $");
        int salary = sc.nextInt();

        Employee e1 = new Employee(name);
        Employee e2 = new Employee(name, id);
        Employee e3 = new Employee(name, id, salary);

        e1.display(name);
        e2.display(name, id);
        e3.display(name, id, salary);

        sc.close();
    }

}
