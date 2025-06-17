import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Intermediate {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(Arrays.asList("hi", "hello", "ho"), Arrays.asList("Gnani", "reji", "suji"), Arrays.asList("Apple", "fruity", "keep"));
            System.out.println("Total List : "+ list);
        Set<String> intermediateResults = new HashSet<>();

        List<String> result =  list.stream()
                .flatMap(List::stream)
//                .filter(s -> s.startsWith("h"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .peek(s -> intermediateResults.add(s))
                .collect(Collectors.toList());

        System.out.println("Intermediate Results:");
        intermediateResults.forEach(System.out::println);

        System.out.println("Final Result:");
        result.forEach(System.out::println);
    }

}
