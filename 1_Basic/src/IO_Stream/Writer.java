package IO_Stream;

import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) {
        try{
            FileWriter fw =new FileWriter("D:\\Study_Materials\\Project\\7th Sem\\Java_Programming\\1_Basics\\src\\IO_Stream\\test2.txt");
            fw.write("Hello I wrote from File Writer.");
            fw.close();
        }catch (Exception e){
            System.out.println(e);}
            System.out.println("Writing in the file...");
        }
    }

