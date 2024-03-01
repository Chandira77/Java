package W_exception_handling;

public class a_exception_problem {
    public static void main(String[] args) {
        int a=12, b=3, result;
        try{
            result =a/b;
            System.out.println("the result= "+result);
        }catch(ArithmeticException e){
            System.out.println("we can not devide a number by zero"+e);
        }
    }
}
