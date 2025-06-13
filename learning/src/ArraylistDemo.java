

import java.util.*;

public class ArraylistDemo {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>(Arrays.asList("Gnane", "reji", "rupa", "hue","sdf"));

        System.out.println("Original list : " + li);

       li.remove(2);
        System.out.println( "After Remove  : " + li);


        System.out.println( "Get value at index 2 : " +li.get(2));

        Collections.sort(li);
        System.out.println("After sorting : " +li);

        li.set(1,"hur");
        System.out.println("After setting value : " + li);

        System.out.println("List size  : " + li.size());

        System.out.println("is list  Empty : " + li.isEmpty());

        //List iterator loop forward and backward through a list
        ListIterator<String> lIt = li.listIterator();
        System.out.println("forward :");
        while (lIt.hasNext()){
            System.out.println(lIt.next());
        }
        System.out.println("Previous :");
        while(lIt.hasPrevious()) {
            System.out.println(lIt.previous());
        }
          System.out.println("synchronized  iteration : ");
        li = Collections.synchronizedList(li);
        synchronized (li) {

            for (String s : li) System.out.println(s);

        }

        li.clear();
        System.out.println("After clear  : " +li);
    }


}
