import java.util.Scanner;

public class recursion4 {
    //sum of digits
    //last digit = num % 10
    // 1st to 2nd last digit = num / 10
    static int sod(int n){
        if (n >= 0 && n<= 9){
            return n;
        }

        int smallAns = sod(n/10);

        int ans = smallAns + n%10;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        System.out.println(sod(n));
    }
}
