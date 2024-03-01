package W_exception_handling;

public class d_Exceptio_finally {
    public static void main(String[] args) {
        int a=12, b=3, result;
        try{
            result =a/b;
            System.out.println("the result= "+result);
        }catch(ArithmeticException e){
            System.out.println("we can not devide a number by zero"+e);
        }finally{
            System.out.println("be careful when you divide a number by zero");
        }
    } 
}
