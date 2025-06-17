import java.util.*;

public class ConcatenatedSubstringFinder {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s == null || s.isEmpty() || words == null || words.length == 0)
            return result;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        // Map to store frequency of each word
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words)
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);

        // Slide through the string
        for (int i = 0; i <= s.length() - totalLen; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;

            while (j < wordCount) {
                int wordStart = i + j * wordLen;
                String currentWord = s.substring(wordStart, wordStart + wordLen);

                if (!wordMap.containsKey(currentWord))
                    break;

                seen.put(currentWord, seen.getOrDefault(currentWord, 0) + 1);

                if (seen.get(currentWord) > wordMap.get(currentWord))
                    break;

                j++;
            }

            if (j == wordCount)
                result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        String s1 = "wordgoodgoodgoodbestword";
        String[] words1 = {"word","good","best","word"};
        String s2 = "barfoofoobarthefoobarman";
        String[] words2 = {"bar","foo","the"};
        System.out.println(findSubstring(s2,words2));
        System.out.println(findSubstring(s1,words1));
        System.out.println(findSubstring(s, words));  // Output: [0, 9]
    }
}
