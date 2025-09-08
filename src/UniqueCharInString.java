public class UniqueCharInString {
    public static void main(String[] args) {
        String a = "ab";
        String result = "Unique char string";
        boolean[] arr = new boolean[128];
        for(int i =0; i<a.length(); i++) {
            int x = a.charAt(i);
            if(arr[x]){
                result = "Not a unique char string";
                break;
            }
            arr[x] = true;
        }
        System.out.println(result);
    }
}
