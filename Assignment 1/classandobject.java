import java.util.Scanner;

class Student {
    String name;
    int roll;
    int marks;

    void display() {
        System.out.println("Student Details: \n");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: " + marks);
    }
}

public class classandobject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.print("Enter your name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        s1.roll = sc.nextInt();

        System.out.print("Enter your marks: ");
        s1.marks = sc.nextInt();

        System.out.println("\n");

        s1.display();

        sc.close();

    }
}