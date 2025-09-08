public class StriingRotation {
    public static void main(String[] args) {
        System.out.println(rotation( "waterbottle", "erbottlewat"));
    }
    static String rotation(String a, String b) {
        String temp1 = b.substring(b.length()-1);
        String temp2 = b;
        if(a.length() != b.length()) {
            return "can't rotate";
        } else {
            for(int i=b.length() -1; i>0; i--) {

                temp1 = temp1 + temp2.substring(0, temp2.length() - 1);
                temp2 = temp1;
                if(temp2.toString().equalsIgnoreCase(a)) {
                    return "rotation";
                }
                temp1 = temp1.substring(temp1.length()-1);
            }
        }
        return "not a rotation";
    }
}
