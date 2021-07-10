//Program where there is synchronization between threads by using annonymous class

package synchronization;

class Table3 {
    //method with synchronization
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Annonymous_Sync {
    public static void main(String[] args) {
        Table3 obj = new Table3();

        //creating first thread
        Thread t1 =new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };

        //creating second thread
        Thread t2 =new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };

        //call threads
        t1.start();
        t2.start();
    }
}
