import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        //1------------------------------------------------------
        List<Integer> numbers = Arrays.asList(5, 12, 18, 7, 25, 30);
        List<Integer> result = numbers.stream()
                .filter(n -> n > 10 && n % 2 == 0).toList();
        System.out.println("1. Printing list with even numbers greater than 10: "+ result);

        //2------------------------------------------------------
        List<String> input = Arrays.asList("ankur", "john", "alice");
        List<String> resultUpper = input.stream().map(String::toUpperCase).toList();
        System.out.println("2. Printing list with uppercase: "+resultUpper);

        //3------------------------------------------------------
        List<Integer> number2 = Arrays.asList(1,3,5,6,3,4);
        int sum = number2.stream().reduce(0, Integer::sum);
        System.out.println("3. Printing sum of all the integers in a list: " +sum);

        //4-------------------------------------------------------
        List<String> names = Arrays.asList("Ankur", "John", "Alice", "Bob");
        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("4. Printing the list grouping in the size of each string: "+ grouped);

        //5-------------------------------------------------------
        List<String> names2 = Arrays.asList("Ankur", "John", "Alice", "Bob");
        String longest = names.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("5. Printing the string with highest length: "+longest);

        //6-------------------------------------------------------
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5),
                Arrays.asList(6)
        );
        List<Integer> flatList = listOfLists.stream()
                .flatMap(List::stream).toList();

        System.out.println("6. Printing flat list: "+flatList);
    }
}
