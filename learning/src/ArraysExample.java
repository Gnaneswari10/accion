import java.util.Arrays;
public class ArraysExample {
    public static void main(String[] args) {

        int[] myarray1 = {1, 2, 8, 4};// 2 ways to assign an array and single dimensional array
        System.out.println(Arrays.toString(myarray1));
        //for sorting only for 1d
        Arrays.sort(myarray1);
        System.out.println("sorting oder");
        System.out.println( Arrays.toString(myarray1));


        System.out.println("Integer Array is range : " // array range
                + Arrays.toString(
                Arrays.copyOfRange(myarray1, 1, 3)));

        // if we want  print an array directly  we will get memory reference so we are using that toString,it works only 1d Array


        System.out.println("   ");
            System.out.println("multidimensional Array");
        // Multi-Dimensional Array
        // for multi-dimensional we use deepToString
        int [][] myarray2 = { {1,3,5},{2,5,6},{3,7,9}};

        System.out.println(Arrays.deepToString(myarray2));

        //for-each loop.This loop goes row by row.
        for(int[] temp : myarray2){
            for(int val : temp){
                System.out.print(val+" ");
            }
            System.out.println();
        }


        System.out.println("    ");

        //Jagged Array where each row can have a different number of columns.
        //each row which have different number of rows
        System.out.println("jagged Array");
        int [][] myarray3 = new int[3][];

        myarray3[0] =  new int[]{1,3,4};//in 0 row we have 3 elements
        myarray3[1] = new int[]{2,5};
        myarray3[2] = new int[]{4,7,8};
        System.out.println(Arrays.deepToString(myarray3));
        //How to Access and Print Jagged Arrays
        for (int i = 0; i < myarray3.length; i++){
                for (int j =0; j < myarray3[i].length; j++){
                    System.out.print(myarray3[i][j] + " ");
                }
            System.out.println();
        }

    }

}
