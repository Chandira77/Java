import java.util.Scanner;

public class c_input_user_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Your name is = " + name);
        sc.close();
    }
}