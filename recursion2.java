import java.util.Scanner;

public class recursion2 {//factorial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    static int factorial(int n){
        if(n==0){                 //base case
            return 1;
        }
        //it can aslo be written as
        //return n * factorial(n-1);

        //smaller problem
        int smallAns = factorial(n-1);
        
        //self work
        int ans =  n * smallAns;
        return ans;
    }
}
