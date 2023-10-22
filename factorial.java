import java.util.Scanner;

public class factorial {
    static int factorial(int n){
        // base case
        if (n==0){
            return 1;
        }
        //smaller problem - recursive work
        int smallans = factorial(n-1);
        //big problem - self work
        int ans = n* smallans;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
