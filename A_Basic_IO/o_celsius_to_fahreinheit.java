import java.util.Scanner;

public class o_celsius_to_fahreinheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter temperature in celcius:");
        double cel = sc.nextDouble();
        double fah = (9.0 / 5.0) * cel + 32;
        System.out.println("The conversion temperation in fahrenheit is =" + fah);
        sc.close();
    }
}
