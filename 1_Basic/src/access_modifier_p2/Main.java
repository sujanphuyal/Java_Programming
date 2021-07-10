package access_modifier_p2;
import access_modifer_p1.*;

public class Main extends A {
    public static void main(String[] args) {

        //default and private access modifier from package p1 can't be accessed
        // System.out.println(obj1.def);
        // System.out.println(obj1.pri);

        Main obj = new Main();
        System.out.println(obj.pro); //this is possible because we used inheritance through "extends" keyword

        //public access modifier whereas can be accessed
        System.out.println(obj.pub);


    }
}
