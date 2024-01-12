import java.util.Scanner;

public class recursion6 {
    //power of p to q
    static int powerof(int p,int q){
        if(q == 0){
            return 1;
        }
        int smallAnss = powerof(p, q-1);

        return powerof(p , q-1) * p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter 1st number: ");
        int p = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int q = sc.nextInt();

        System.out.println(powerof(p, q));
        
    }
}
