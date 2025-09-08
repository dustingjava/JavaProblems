public class Fibonacci {
    public static void main(String[] args) {
        //Print the total of fibonacci sequence
        System.out.println(fibo(7));
        //Print the entire series till this number
        for(int i=8; i>0; i--){
            System.out.println(fiboPrint(i));
        }
        //Print the total without recursion
        System.out.println(fiboNoRecursion(8));
    }
    static int fibo(int n) {

        if(n <= 0 ) {
            return(0);
        } else if(n==1) {
            return 1;
        }else {
            return(fibo(n-1) + fibo(n-2));
        }
    }

    static int fiboPrint(int n){
        if(n <= 0 ) {
            return(0);
        } else if(n==1 || n==2) {
            return(1);
        }else {
            return(fiboPrint(n-1) + fiboPrint(n-2));
        }
    }

    static int fiboNoRecursion(int n){
        int sum = 1;
        int temp = 1;
        int prev = 0;
        if(n <= 0 ) {
            return(0);
        } else if(n==1) {
            return(1);
        }else {
            for(int i=0; i<n; i++){
                prev = temp;
                temp = sum + temp;
                sum = prev;
            }
        }
        return sum;
    }
}
