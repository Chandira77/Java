import java.util.Scanner;

public class h_area_of_different_triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st side of a triangle:");
        int side1=sc.nextInt();
        System.out.println("Enter the 2nd side of a triangle:");
        int side2=sc.nextInt();
        System.out.println("Enter the 3rd side of a triangle:");
        int side3=sc.nextInt();
        if(side1==side2 &&side2==side3)
        {
            System.out.println("It is a Equliteral triangle:");
        } 
        else if(side1==side2 || side2==side3 || side3==side1){
            System.out.println("It is a Isosceless triangle:");
        }
        else {
            System.out.println("It is a Scalene triangle:");
        }
    sc.close();
    }
}
