package creating_interface;

public class Main {
    public static void main(String[] args) {
        Ride r1 = new Bike();   //possible because "Bike" class in "Vehicle" class file implements the "Ride" interface
        r1.ride();
    }
}
