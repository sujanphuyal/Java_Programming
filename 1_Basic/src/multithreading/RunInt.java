package multithreading;

//creating a simple thread using Runnable Interface
public class RunInt implements Runnable{
    @Override
    public void run() {
        /*This method takes in no arguments.
        When the object of a class implementing Runnable class is used to create a thread,
        then the run method is invoked in the thread which executes separately. */

        System.out.println("Thread has ended.");
    }

    public static void main(String[] args) {

        //create object of the class RunInt
        RunInt ri = new RunInt();

        //Pass object of class RunInt as parameter to Thread() constructor
        Thread t1 = new Thread(ri);

        //start the thread
        t1.start();
        System.out.println("Thread has started.");
    }
}
