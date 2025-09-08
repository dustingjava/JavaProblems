public class PermutationOfPalindrom {
    public static void main(String[] args) {
        String abc = "aabb ccdt";
        int[] arr = new int[128];
        int totalChar = 0;
        int odd = 0;
        for(int i =0; i<abc.length(); i++) {
            if(" ".charAt(0) == abc.charAt(i)) {
                continue;
            }
            arr[abc.charAt(i)] ++;
            totalChar++;
        }
        for(int j =0; j<arr.length; j++) {
            if (arr[j] %2 != 0) {
                odd ++;
            }
        }
        if(totalChar %2 == 0 && odd>0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
