import java.util.Scanner;

public class m_Area_and_perimeter_of_rectangle {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of cuboid:");
        int length = sc.nextInt();
         System.out.println("Enter the bredth of cuboid:");
        int bredth = sc.nextInt();
        int area = length * bredth;
        int perimeter = (2* (length + bredth));
        System.out.println("the volume of cuboid is:" + area);
        System.out.println("the volume of cuboid is:" + perimeter);
        sc.close();
    }
}
