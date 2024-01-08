import java.util.*;

public class recursion1{

    static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
