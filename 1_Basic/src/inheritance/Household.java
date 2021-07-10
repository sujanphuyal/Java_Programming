package inheritance;

public class Household {
    public static void main(String[] args) {
        //creating objects for respective class
        Information i1 = new Information();
        Fridge f = new Fridge();
        Dining_Table d = new Dining_Table();

        //calling function using above objects
        f.info1();
        d.info2();
    }
}
