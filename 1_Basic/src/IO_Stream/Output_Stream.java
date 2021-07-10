package IO_Stream;

import java.io.FileOutputStream;

public class Output_Stream {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("D:\\Study_Materials\\Project\\7th Sem\\Java_Programming\\1_Basics\\src\\IO_Stream\\test1.txt");
            String s= "This is test result for file output.";
            byte b[]=s.getBytes();  //converting string into byte array
            fos.write(b);
            fos.close();
            System.out.println("Successfully written");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
