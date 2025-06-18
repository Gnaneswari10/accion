import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Apple");
        arraylist.add("Banana");
        arraylist.add("Mango");
        arraylist.add("goa");

        ListIterator<String> listIterator = arraylist.listIterator();
        System.out.println("forward");


        while (listIterator.hasNext()) {
             String fruits = listIterator.next();
            System.out.println(fruits);
            if (fruits.equals("Banana")) {
                listIterator.set("orange");
            }
            if (fruits.equals("goa")) {
                listIterator.add("chiku");
            }
        }
        System.out.println("After modification " +  arraylist);


        System.out.println("backward");
        while (listIterator.hasPrevious()){
            String  fruits = listIterator.previous();
            System.out.println(arraylist);

        }


    }
}
