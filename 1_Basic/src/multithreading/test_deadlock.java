package multithreading;

//deadlocking with use if Main Thread i.e. only using as single thread
public class test_deadlock {
    public static void main(String[] args) {
        try{
            System.out.println("We are entering into the deadlock");
            Thread.currentThread().join();
            System.out.println("Since we are in deadlock state I will never be printed");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
