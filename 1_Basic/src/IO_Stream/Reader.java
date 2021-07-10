package IO_Stream;

import java.io.FileReader;

public class Reader {
    public static void main(String[] args)throws Exception {
        FileReader fr =new FileReader("D:\\Study_Materials\\Project\\7th Sem\\Java_Programming\\1_Basics\\src\\IO_Stream\\test.txt");
        int i;
        while ((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
}
