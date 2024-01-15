import java.util.Scanner;

public class recursion8 {
    //alternate sum and sub series  ex = 1-2+3-4+5.
    static int altersign(int n){
        if(n==0){
            return 0;
        }

        if(n%2 == 0){
            return altersign(n-1) - n;
        }
        else{
            return altersign(n-1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the series:");
        int n = sc.nextInt();

        System.out.println(altersign(n));
    }
}
