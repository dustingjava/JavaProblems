public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compressedString("aabccddddddrr"));
    }
    static String compressedString(String a){
        StringBuilder comp = new StringBuilder();
        int consecutive = 0;
        for(int j =0; j<a.length()-1; j++){
            consecutive++;
            if(a.charAt(j) != a.charAt(j+1)) {
                comp.append(a.charAt(j));
                comp.append(consecutive);
                consecutive = 0;
            }

        }
        comp.append(a.charAt(a.length()-1));
        comp.append(consecutive+1);
        return comp.toString();
    }
}
