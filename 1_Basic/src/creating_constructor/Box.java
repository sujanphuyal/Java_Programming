package creating_constructor;

public class Box {
    double width;
    double height;
    double depth;

    //default constructor
    Box (){
        /*if you want to call another constructor within constructor then use:
        this(parameter/no-parameter);
         */
        System.out.println("Ths is default constructor for box 1.");
        width=2;
        height=2;
        depth=2;
    }

    //paramaterized constructor
    //setting local variable = instance variable
    Box (double width, double height, double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
        System.out.println("Ths is paramaterized constructor for box 2.");
    }

    //compute and return volume
    double volume(){
        return width*height*depth;
    }
}
class BoxDemo2{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box(3,3,3);
        double vol;

        //get volume of box 1
        vol=mybox1.volume();
        System.out.println("Volume of box 1 is "+vol);

        //get volume of box 2
        vol=mybox2.volume();
        System.out.println("Volume of box 2 is "+vol);
    }
}