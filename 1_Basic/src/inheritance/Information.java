package inheritance;

public class Information {
    //store name of the class in the field "name"
    String name = this.getClass().getSimpleName();
    void info1(){
        System.out.println(name +" requires less space.");
    }
    void info2(){
        System.out.println(name +" requires more space.");
    }
}
