package multithreading;

//creating first thread
class Thread1 implements Runnable {
    Thread t1; //refrence to Thread Class
    Thread1(){
        t1 = new Thread(this,"Thread 1");
        System.out.println("Thread is running:" + t1);
        t1.start();
    }

    @Override
    public void run() {
        for(int i=1; i<6;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//creating second thread
class Thread2 implements Runnable {
    Thread t2; //refrence to Thread Class
    Thread2(){
        t2 = new Thread(this,"Thread 2");
        System.out.println("Thread is running: "+ t2);
        t2.start();
    }

    @Override
    public void run() {
        for(int i=7; i<14;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        new Thread1();
        new Thread2();
    }
}
