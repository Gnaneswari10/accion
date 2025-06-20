public class ThreadExample {
    public static void main(String[] args) {
        int cakecount = 4;
        for  (int i=0 ;i < cakecount;i++){
            Cake cake = new Cake();
            cake.start();
            cake.setName("name "+(i+1));
           try {
               if (i==1){
                   Thread.sleep(2000);
               }
           }
           catch (Exception e){

           }
        }

    }
}
class Cake extends Thread{

    public void run(){
        System.out.println("Mixing ingredients for cake "+Cake.currentThread().getName());
        System.out.println(("baking cake " +Cake.currentThread().getName() ));
        System.out.println("Decoration "+Cake.currentThread().getName());
    }



}
