package W_exception_handling;

public class b_exception_null {
    public static void main(String[] args) {
        int num[] = null;
        try{
            System.out.println(num[6]);
        }catch(Exception e){
            System.out.println("Exception handled.");
        }
        //}catch(ArithemeticException e){
        // System.out.println("ArithemeticException handled.");
       // }
        // }catch(NullPointerException e){
         //   System.out.println("NullPointerException handled.");
        //}
    }
}

