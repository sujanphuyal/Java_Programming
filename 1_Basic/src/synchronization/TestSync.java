//Program where there is synchronization between threads

package synchronization;

//importing from Table2 class into main function TestSync
import static synchronization.Table2.*;

class Table2 {
    //method with synchronization
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    //creating first thread
    static class Thread1 extends Thread{
        Table2 t;
        Thread1(Table2 t) {
            this.t=t;
        }
        public void run() {
            t.printTable(5);
        }
    }

    //creating second thread
    static class Thread2 extends Thread{
        Table2 t;
        Thread2(Table2 t) {
            this.t=t;
        }
        public void run() {
            t.printTable(100);
        }
    }

}

class TestSync {
    public static void main(String[] args) {
        Table2 obj =new Table2();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}
