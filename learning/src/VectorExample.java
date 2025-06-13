import java.util.Collections;
import java.util.Vector;
// Vector is used when thread-safe operations are required (synchronized access)
public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector  = new Vector<>(4,2);
        vector.add(1);
        vector.add(13);
        vector.add(7);
        vector.add(21);
        vector.add(8);
        System.out.println("Vector contents before sorting:");
        System.out.println( vector);

        Vector<Integer> defaultVector = new Vector<>();

        System.out.println( " Default Vector Capacity: : "  +  defaultVector.capacity());

        System.out.println(" Custom Vector Capacity: " + vector.capacity());


        vector.remove(3);// index 3
        System.out.println("Vector after removing element at index 3: " + vector);


        Collections.sort(vector);
        System.out.println( "After sorting the list : " + vector);

        System.out.print("Vector elements using for-each: ");
        // Using the for each loop
        for (Integer i : vector) {
            System.out.print(i +  " ");
        }
        System.out.println();
    }
}
