public class MultiRunnableExample {
    public static void main(String[] args) {
        int cakecount = 4;
        for  (int i=0 ;i < cakecount;i++){
            Cake1 cake = new Cake1();
            Thread thread = new Thread(cake);
            thread.start();
//            try {
//                if (i==2){
//                    thread.sleep(3000);
//                }
//            }
//            catch (Exception e){
//
//            }

        }

    }
}
class Cake1 implements Runnable{

    public void run(){
        System.out.println("Mixing ingredients for cake "+Thread.currentThread().getId());
        System.out.println(("baking cake " +Thread.currentThread().getId() ));
        System.out.println("Decoration "+Thread.currentThread().getId());
    }



}
