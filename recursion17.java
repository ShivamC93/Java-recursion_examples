/*There are N stones, numbered 0,1,2,...,N-1. For each i (05i<N), the height of Stone i is hi. There is a
frog who is initially on Stone 0. He will repeat the following action some number of times to reach
Stone N-1:
If the frog is currently on Stone i, jump to Stone i+1 or Stone i+2.
Here, a cost of hi - hj is incurred, where j is the stone to land on.

Find the minimum possible total cost incurred before the frog reaches Stone N.*/

public class recursion17 {

    static int best(int[] h , int n,int idx){
        if ( idx == n-1) return 0;

        int opt1 =  best(h, n, idx+1) + Math.abs(h[idx] - h[idx+1]) ;
        if (idx == n-2) return opt1;

        int opt2 = best(h, n, idx+2) + Math.abs(h[idx] - h[idx+2]);

        return Math.min(opt1, opt2);
    }
    public static void main(String[] args) {
        int[] h = {10,30,40,20};
        System.out.println(best(h, h.length, 0));
    }


}
