package IO_Stream;

import java.util.Scanner;

public class Char_Read {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input a character.");

        //sc.next() finds and returns the next complete token from the scanner
        //charAt(0) reads a character from string at the specified index value
        //reading a character
        char c = sc.next().charAt(1);

        //print the charcater
        System.out.println("The character at the specified index is "+c);
    }
}
