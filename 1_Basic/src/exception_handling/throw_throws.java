package exception_handling;
import java.io.*;

class Hello{
    void method() throws IOException{           // "throws" declares an exception
        throw new IOException("Device Error!!");            // "throw" throws an exception
    }
}

public class throw_throws{
    public static void main(String[] args) {
        try{
            Hello h1 = new Hello();
            h1.method();
        }
        catch (Exception e){
            System.out.println("Exception handled");
        }
    }
}
