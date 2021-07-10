//Program where there is no synchronization between threads

package synchronization;

class Table {
    //method without synchronization
    void printTable(int n){
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
        Table t;
        Thread1(Table t) {
            this.t=t;
        }
        public void run() {
            t.printTable(5);
        }
    }

    //creating second thread
    static class Thread2 extends Thread{
        Table t;
        Thread2(Table t) {
            this.t=t;
        }
        public void run() {
            t.printTable(100);
        }
    }

}

class TestNoSync {
    public static void main(String[] args) {
        Table obj =new Table();
        Table.Thread1 t1 = new Table.Thread1(obj);
        Table.Thread2 t2 = new Table.Thread2(obj);
        t1.start();
        t2.start();
    }
}
