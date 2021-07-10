package using_super;

public class Lucifer extends God{
    public void info(){
        super.info();   //call super class method
                        //note that superclass and subclass both have methods with same name
                        //super can otherwise be used to access superclass constructor
        System.out.println("Lucifer is a God.");
    }
}
