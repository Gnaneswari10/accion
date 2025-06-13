import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        List<String> result = m.Combing(" ");
        System.out.println(result);


    }
    public List<String> Combing (String nums){
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length() == 0){
            System.out.println(" [] ");
        }
        return result;
    }
}