import java.util.ArrayList;
import java.util.List;

public class MaxFreqDifference {
    public static void main(String[] args) {
        MaxFreqDifference maxFreqDifference = new MaxFreqDifference();
        int result = maxFreqDifference.maxDifference("aaabbbaarr");
        System.out.println(result);

    }
    public int maxDifference (String s){
        int[] freq = new int[26];
        char[] chars = s.toCharArray(); // Convert the string to a character array
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int index = ch - 'a';
            freq[index]++;
        }


        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            int f = freq[i];
            if (f > 0) {
                if (f % 2 != 0) {
                    odd.add(f);
                } else {
                    even.add(f);
                }
            }
        }



        if (odd.isEmpty() || even.isEmpty())
                return 0;

            int max = Integer.MIN_VALUE;
                for (int o : odd) {
                    for (int e : even) {
                        max = Math.max(max, o - e);
                    }
                }

            return max;

    }
}
