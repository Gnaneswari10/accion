import java.util.*;

public class LetterCombination {
    public static void main(String[] args) {
        LetterCombination letterCombination= new LetterCombination();
        List<String> combination = letterCombination.Combing("45");
        System.out.println(combination);


    }

    public List<String> Combing(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        Map<Character, String> Phonemap = new HashMap<>();
        Phonemap.put('2', "abc");
        Phonemap.put('3', "def");
        Phonemap.put('4' , "ghi");
        Phonemap.put('5' , "jkl");
        Phonemap.put('6' , "mno");
        Phonemap.put('7' , "pqrs");
        Phonemap.put('8' , "tuv");
        Phonemap.put('9' , "wxyz");


        backtrack(result, Phonemap, digits, 0,  new StringBuilder());


        return result;

        }

        private void backtrack (List < String > result, Map < Character, String > phonemap, String digits , int index, StringBuilder current){
            if (index == digits.length()) {
                result.add(current.toString());
                        return;
            }
            char digit = digits.charAt(index);

            String letters = phonemap.get(digit);
            for (char letter : letters.toCharArray()) {
                current.append(letter);
                backtrack(result, phonemap, digits, index + 1, current);
                current.deleteCharAt(current.length() - 1);
            }

        }


}

