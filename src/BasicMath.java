public class BasicMath {
    public static void main(String[] args) {
        System.out.println(multiplication(4,8));
        System.out.println(powerOf(3,4));
        System.out.println(division(300,3));
        System.out.println(squareRoot(625));
    }

    static int multiplication(int n, int k){
        if(n == 0 || k == 0) return 0;
        else if(n == 1) return k;
        else if(k == 1) return n;
        else {
            return n + multiplication(n, k-1);
        }
    }
    static int powerOf(int n, int k){
        if(n<0) return 0;
        else if(n == 1 || k == 0) return 1;
        else if(k == 1) return n;
        else {
            return n * powerOf(n, k -1);
        }
    }
    static int division(int n, int k){
        int count = 0;
        if (n == 0) return 0;
        else if (n == 1 ) return 1;
        else if (k == 1) return n;
        else {
            while(n > 0) {
                count ++;
                n = n - k;
            }
            return count;
        }
    }
    static int squareRoot(int n) {
        return 0;
    }
}
