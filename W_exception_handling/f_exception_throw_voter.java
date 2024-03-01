package W_exception_handling;

public class f_exception_throw_voter {
    public void chaeckVoterAge(int age){
        if(age < 18){
            throw new ArithmeticException("you cannot cast your vote");
        }else{
            System.out.println("you are eligble to cast your vote");
        }
    }
    public static void main(String[] args) {
     f_exception_throw_voter v1 = new f_exception_throw_voter();
     v1.chaeckVoterAge(12);
    
}
}