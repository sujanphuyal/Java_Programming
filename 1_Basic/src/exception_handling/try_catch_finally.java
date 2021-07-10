package exception_handling;

public class try_catch_finally {
    public static void main(String[] args) {
        try {
            int a=50/0; //it may throw exception
        }
        catch(Exception e){
            //display error message
            System.out.println("Can't divide by zero.");
        }
        finally {
            System.out.println("Info in this block is always executed");
        }
    }
}
