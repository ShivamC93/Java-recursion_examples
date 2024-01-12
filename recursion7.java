import java.util.Scanner;

public class recursion7 {
    //print multiple of num , K times.
    static int printMult(int n, int k){
        if (k == 1) return n;

        printMult(n, k-1);

        return n*k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of K :");
        int k = sc.nextInt();

        System.out.println(printMult(n, k));
    }
}
