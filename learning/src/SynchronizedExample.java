public class SynchronizedExample{
    public static void main(String[] args) {
        CakeCounter counter = new CakeCounter();
        Thread thread = new Thread(new Team(counter));
        Thread thread2 = new Thread(new Team(counter));
        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();

                Thread.sleep(3000);

        }
            catch (Exception E){

            }
        System.out.println(counter.cakecount);
    }
}
class CakeCounter{
    int cakecount = 0;

    public synchronized void increment() {
        cakecount++;

    }
}
class Team implements Runnable{
    CakeCounter Counter;
    Team(CakeCounter counter){
        this.Counter = counter;

    }
    public void run() {
        for (int i=0; i<5000;i++){
            Counter.increment();
        }
    }
}
