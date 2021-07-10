package IO_Stream;

import java.util.Scanner;

public class Str_Read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next(); //read string before the space
        System.out.println("First string you have entered is "+str);
    }
}
