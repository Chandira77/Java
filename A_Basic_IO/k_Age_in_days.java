import java.util.Scanner;
public class k_Age_in_days {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter age:");
        int age =sc. nextInt();
        int days = 365 * age;
        System.out.println("the total days of age="+days);
        sc.close();
    }
}
