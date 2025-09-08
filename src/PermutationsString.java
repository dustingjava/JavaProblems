import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsString {
    public static void main(String[] args) {
        String a = "test";
        String b = "estt";
        if(a.length() == b.length() && sort(a).equals(sort(b))) {
            System.out.println("Both the strings are permutations of each other");
        } else {
            System.out.println("Both are not permutations of each other");
        }
    }
    public static String sort(String a) {
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
}
