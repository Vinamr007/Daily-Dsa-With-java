package UdemyTelesko.corejava;

public class exception_throw {
    public static void main(String[] args) {
        int age=16;

        if(age<18){
            throw new ArithmeticException("age is not valid for voting ");

        }
        System.out.println("eligible");
    }
}
