import java.util.Arrays;
// example for multidimensional array
public class MultiExample {
    public static void main(String[] args) {
        int students = 3;
        int semester= 2;
        int subjects = 6;


        int[][] studentMarks1 = {{40,46,30,38,27,45},{37,27,34,37,25,34}};

        int [][] studentMarks2 = {{26,34,56,37,12,35},{36,48,46,57,37,23}};

        int [][] studentMarks3 = {{35,36,47,48,50,26},{17,28,38,49,16,27}};

        int [][][] total = new int[students][semester][subjects];
        total[0] = studentMarks1;
        total[1]=studentMarks2;
        total[2]=studentMarks3;

        System.out.println(Arrays.deepToString(total));
        System.out.println();
        // Printing semester-wise marks

        for (int i=0;i<students;i++){
            System.out.println("Students " + (i + 1)) ;

            for (int j = 0; j < semester; j++) {
                System.out.print("Semester " + (j + 1) + " : ");

                for (int k=0;k<subjects;k++){
                    System.out.print(total[i][j][k] + " ");
                }

                System.out.println();
            }
            System.out.println();
        }


    }
}
