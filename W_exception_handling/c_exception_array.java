package W_exception_handling;

public class c_exception_array {
   public static void main(String[] args) {
    int mynum[] = {12,23,43,33,32};
    try{
        for(int i=0; i<=mynum.length; i++){
            System.out.println(mynum[1]);
        }
    }catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException hanadled ");
    }
   } 
}
