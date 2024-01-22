import java.util.Scanner;

public class recursion16 {
    //check palindrome
    static String rev(String s, int idx){
        if(idx == s.length()) return "";

        String smallAns = rev(s, idx+1);

        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String rev1 =rev(s, 0);

        if(rev1.equals(s)){
            System.out.println(s + "is palindrome");
        }else{
            System.out.println(s + "is not palindrome");
        }
    }
}
