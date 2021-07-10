package creating_class_object;

public class Box {
    double width;
    double height;
    double depth;

    //compute and return volume
    double volume(){
        return width * height * depth;
    }

    //set dimensions of box
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
class BoxDemo{
    public static void main(String[] args) {

        //creating object for a class
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //intializing each box
        mybox1.setDim(1,2,3);
        mybox2.setDim(2,3,4);

        //get volume of box 1
        vol = mybox1.volume();
        System.out.println("Volume of box 1 is "+vol);

        //get volume of box 2
        vol= mybox2.volume();
        System.out.println("Volume of box 2 is "+vol);

    }
}
