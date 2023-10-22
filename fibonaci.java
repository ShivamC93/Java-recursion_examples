public class fibonaci {
    static int fib(int n){
        if (n==0 || n==1){
            return n;
        }

        int prev1 = fib(n-1);
        int prev2 = fib(n-2);

        int ans = prev1 + prev2;
        return ans;
    }
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
        System.out.println(fib(i));
        }
    }
}
