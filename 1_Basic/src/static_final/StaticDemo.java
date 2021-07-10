package static_final;

class Demo{
    //To create our own constant, keword "final' is similar to "const" in C/C++/C#
    public static final String Gorkhali = "Warrior";

    //instance variable
    public String city;

    //static variable or class variable
    public static String Country;
    public static int count =0;

    //creating simple constructor which is called every time we create object
    public Demo(){
        count++; //count is static field belonging to the class
    }

    //creating static method
    static void postalcode(int p){
        System.out.println("Its postal code is "+p+ ".");

        /*static method can access static variable data as below
        System.out.println(Demo.Country);
        but cannot access non-static data
        whereas non-static method can access both*/
    }

    //creating static block
    static {
        System.out.println("Hello I am from static block.");
    }

}

public class StaticDemo {
    public static void main(String[] args) {
        //assigning value to a static variable of a class
        Demo.Country="Nepal";       //No need to create object like instance variable

        //creating object for class
        Demo demo1 = new Demo();

        //assigning value to a instance variable using object method
        demo1.city="Kathmandu";

        //printing value from instance variable and static variable
        System.out.println(demo1.city+" is capital city of "+Demo.Country+".");

        //static method constructor called outside the class Demo
        Demo.postalcode(6440);

        //Java inbuilt constant example
        System.out.println("The value of Exponential constant is "+Math.E+".");

        //Printing our constant
        System.out.println("Gorkhali is another name for "+Demo.Gorkhali+".");

        //Displaying the total object created
        System.out.println("Total number of object created is "+Demo.count+".");

    }
}
