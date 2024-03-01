import java.util.Scanner;

public class i_volume_of_cuboid {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of cuboid:");
        float length = sc.nextFloat();
         System.out.println("Enter the bredth of cuboid:");
        float bredth = sc.nextFloat();
         System.out.println("Enter the height of cuboid:");
        float height = sc.nextFloat();
        float volume = (float) (length * bredth * height);
        System.out.println("the volume of cuboid is:" + volume);
        sc.close();
    }
}
