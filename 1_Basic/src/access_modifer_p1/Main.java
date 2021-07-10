package access_modifer_p1;

public class Main {
    public static void main(String[] args) {
        //creating object for a class A
        A obj = new A();

        // Default(lack of access modifier): can be accessed only within the package and its class
        System.out.println(obj.def);

        // Private: can be accessed only within the specific class
        // System.out.println(obj.pri);

        //Protected: class can be accessed only within the package and its class
        // If another package wants to access the protected class it needs to use "extends" keyword
        System.out.println(obj.pro);

        // Public: class can be accessed from anywhere (within or outside the package and its class)
        System.out.println(obj.pub);

    }
}
