import java.util.Scanner;

public class Recursionbasic{
    static void printIncreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1); //recursive call
        System.out.println(n);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}