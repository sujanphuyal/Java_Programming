package multithreading;

//working with the main thread an child thread by using main thread
public class thread_control extends Thread {

    //"static" keyword must be used while creating class in same class file
    public static class ChildThread extends Thread{
    }

    public static void main(String[] args) {

        //getting reference to main thread
        Thread t1 = Thread.currentThread();

        //getting name of the main thread
        System.out.println("The name of current thread is "+ t1.getName());

        //changing the name of main thread
        t1.setName("mellow");
        System.out.println("The new name of the thread is "+ t1.getName());

        //getting priority of main thread
        System.out.println("Priority of main thread is "+ t1.getPriority());

        //setting priority of main thread to MAX(10)
        t1.setPriority(MAX_PRIORITY);
        System.out.println("The new priority of main thread is "+ t1.getPriority());
        System.out.println("\n");

        //object of ChildThread class can be created
        ChildThread c1 = new ChildThread() ;

        //getting priority of child thread which is created by main thread
        System.out.println("The priority of child thread is "+ c1.getPriority());

        //setting the priority of child thread to MIN(1)
        c1.setPriority(MIN_PRIORITY);
        System.out.println("The new priority of child thread is "+c1.getPriority());

        //start the child thread
        c1.start();
    }
}
