public class PowerOf2 {
    public static void main(String[] args) {
        int n = 8;
        for(int i=0; i<=n; i++){
            System.out.println(printVal(i));
        }

    }
    static int printVal(int k) {
        if(k==0) {return 1;}
        else if(k==1) {return 2;}
        else {
            return 2* printVal(k-1);
        }
    }
}
