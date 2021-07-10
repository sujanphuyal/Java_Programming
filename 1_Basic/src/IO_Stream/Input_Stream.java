package IO_Stream;

import java.io.FileInputStream;

public class Input_Stream {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("D:\\Study_Materials\\Project\\7th Sem\\Java_Programming\\1_Basics\\src\\IO_Stream\\test.txt");
            int i= 0;
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
