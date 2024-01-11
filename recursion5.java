import java.util.*;

public class recursion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitCount(n));
    }

    static int digitCount(int n){
        if(n /10 == 0){
            return 1;
        }

        return digitCount(n/10) + 1;
    }
}
