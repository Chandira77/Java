import java.util.Scanner;

public class l_operators {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int FirstNum = sc.nextInt();
         System.out.println("Enter 2nd number:");
        int SecNum = sc.nextInt();
        int Sum = FirstNum + SecNum;
        int Difference = FirstNum - SecNum;
        int Mul = FirstNum * SecNum;
        int Div = FirstNum / SecNum;
        System.out.println("the sum of "+ FirstNum +" and " + SecNum + " is:" + Sum);
        System.out.println("the difference of "+ FirstNum +" and " + SecNum + " is:" + Difference);
        System.out.println("the multiply of "+ FirstNum +" and " + SecNum + " is:" + Mul);
        System.out.println("the division of "+ FirstNum +" and " + SecNum + " is:" + Div);
        sc.close();
    }
}
