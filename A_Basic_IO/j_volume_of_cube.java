import java.util.Scanner;

public class j_volume_of_cube {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of cube:");
        int length = sc.nextInt();
        int volume = (int) Math.pow(length, 3 );
        System.out.println("the volume of cube is:" + volume);
        sc.close();
    }
}
