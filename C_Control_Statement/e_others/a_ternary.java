package C_Control_Statement.e_others;

import java.util.Scanner;

public class a_ternary {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your Nationality");
        String Country = sc.next();
        if (Country == "Nepal") {
            
        System.out.println("Please enter your age :");
        int age = sc.nextInt();
        String result = (age >= 18) ? "voter" : "non voter"; // ternary operator
        System.out.println("The result = " + result);
    }
        else {
            System.out.println("firstly you should be a Neplease to get a voter card");
        }
        sc.close();
    }
}
