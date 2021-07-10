package creating_interface;

class Bike implements  Ride{
    public void ride(){
        System.out.println("Riding bike.");
    }
}
class Car implements  Ride{
    public void ride(){
        System.out.println("Riding car.");
    }
}

