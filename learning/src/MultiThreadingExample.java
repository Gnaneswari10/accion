public class MultiThreadingExample {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            Thread obj = new Thread(new MultithreadingTest());
            obj.start();
        }
    }
}
class MultithreadingTest implements Runnable {

    public void run()
    {
        try {

            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {

            System.out.println("Exception has occurred and is caught");
        }
    }
}
