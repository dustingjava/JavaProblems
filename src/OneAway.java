/*There are three types of edits that can be performed on strings: insert a character, remove a character,
        or replace a character. Given two strings, write a function to check if they are one edit or zero edits away. */
public class OneAway {
    public static void main(String[] args) {
        String a = "pale";
        String b = "bake";
        if(a.length() == b.length()) {
            System.out.println(editReplace(a,b));
        } else if(a.length() -1 == b.length()) {
            System.out.println(editInsert(a,b));
        } else if(a.length() == b.length()-1) {
            System.out.println(editRemove(a,b));
        }
    }
   public static String editReplace(String a, String b) {
        boolean difference = false;
        for(int i =0; i<a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                if(difference) {
                    return "False";
                }
                difference = true;
            }
        }
        return "true";
    }

    public static String editInsert(String a, String b) {
        int index1 = 0;
        int index2 = 0;
        boolean difference = false;
        for(int i =0; i<a.length() && index2<b.length(); i++) {
            if(a.charAt(index1) != b.charAt(index2)) {
               if(difference){
                   return "False";
               }
               difference = true;
               index2--;
            }
            index1++;
            index2++;
        }
        return "true";
    }

    public static String editRemove(String a, String b) {
        int index1 = 0;
        int index2 = 0;
        boolean difference = false;
        for(int i =0; i<a.length() && index1<a.length(); i++) {
            if(a.charAt(index1) != b.charAt(index2)) {
                if(difference){
                    return "False";
                }
                difference = true;
                index1--;
            }
            index1++;
            index2++;
        }
        return "true";
    }
}
