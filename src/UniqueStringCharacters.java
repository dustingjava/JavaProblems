public class UniqueStringCharacters {
    public static void main(String[] args) {
        String test = "abcdnhgytr";
        System.out.println(usedRecursion("a b"));
        boolean unique = true;
        for(int i = 0; i<test.length(); i++) {
            for(int j = i+1; j<test.length(); j++){
                if(test.charAt(i) == test.charAt(j)){
                    unique = false;
                    break;
                }
            }
        }
        System.out.println(unique);
    }
    static String usedRecursion(String abc) {
        if(abc.length() == 0 || abc == null){
            return "true";
        } else if (abc.substring(0, abc.length() -1).contains(abc.substring(abc.length()-1, abc.length()))){
            return "false";
        } else {
            usedRecursion(abc.substring(0, abc.length() -1));
        }
        return "true";
    }
}
