import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        List<String> gp = generateParenthesis(2);
        List<String> gp1 = generateParenthesis(4);
        System.out.println(gp1);
        System.out.println(gp);


    }
    public static void genarate(List<String> result ,String s,int open, int close){
        if (open ==0 && close ==0){
            result.add(s);
            return;
        }
        if (open>0){

            genarate(result, s + "(", open - 1, close);

        }
        if (close > open) {
            genarate(result, s + ")", open, close - 1);
        }


    }

        public static List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            genarate(result, "", n, n);
            return result;
        }

}
