import java.util.HashMap;
import java.util.Map;

public class PermutationOfString {
    public static void main(String[] args) {

        System.out.println(oneAway("pale", "ple"));
        Map<String, Integer> map1 = findPermutation("tact coa");
        Map<String, Integer> map2 = findPermutation("atco cta");
        if(map1.equals(map2)){
            System.out.println("Permutation");
        } else {
            System.out.println("not a permutation");
        }
    }

    static Map<String, Integer> findPermutation(String abc){
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        for(int k = 0; k<abc.length(); k++) {
            int count = 1;
            String temp = abc.substring(k,k+1);
            for (int i = k+1; i < abc.length(); i++) {
                if (abc.charAt(k) == abc.charAt(i)) {
                    count = count + 1;
                }
            }
            if(!map1.containsKey(abc.substring(k, k+1))){
                map1.put(temp, count);
            }

        }
        return map1;
    }

    static boolean oneAway(String a, String b){
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
        int count = 0;
        if(array1.length > array2.length+1 || array2.length > array1.length+1){
            return false;
        } else if(array1.length > array2.length){
            count ++;
            for(int i=0; i<array1.length-1; i++){
                if(array1[i] != array2[i]){
                    count ++;
                }
            }
        } else if(array2.length > array1.length) {
            count ++;
            for(int i=0; i<array2.length-1; i++){
                if(array1[i] != array2[i]){
                    count ++;
                }
            }
        } else {
            for(int i=0; i<array2.length-1; i++){
                if(array1[i] != array2[i]){
                    count ++;
                }
            }
        }
        if (count > 1) return false;
        else return true;
    }
}
