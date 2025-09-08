public class URLify {
    public static void main(String[] args) {
        String input = "Here is the input string        ";
        int i = " ".charAt(0);
        char[] arr = input.trim().toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(input.substring(0,1));
        for(int j =1; j<input.trim().length(); j++) {
            if(arr[j] == i) {
                sb.append("%20");
            } else {
                sb.append(arr[j]);
            }
        }
        System.out.println(sb.toString());
    }
}
