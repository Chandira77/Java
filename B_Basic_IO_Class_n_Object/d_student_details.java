package B_Basic_IO_Class_n_Object;

import java.util.Scanner;


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

public class d_student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Person name :");
        String name = sc.nextLine();

        System.out.println("Enter Person age:");
        int age = sc.nextInt();

        Person std = new Person(name, age);

        System.out.println("\n User Details:");
        std.displayDetails();

        sc.close();
    }

}
