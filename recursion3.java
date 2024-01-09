import java.util.Scanner;

public class recursion3 {  //fibonacci seires
    static int fib(int n){
        // Base case
        if(n == 0 || n == 1){
            return n;
        }

        //subProblem = recursive work
        int prev = fib(n-1);
        int prevPrev = fib(n-2);

        //self work
        int ans =  prev + prevPrev;
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

}
