public class recursion13 {
    // find target element in an array.
    static int search(int[] a, int n , int target, int idx){
        if(idx >= n) {
            return -1;
        } 

        if(a[idx] == target) {
            System.out.println("Element found at index " + idx);
        }

        return search(a, n, target, idx+1);
        
    }    
    public static void main(String[] args) {
        int[] a = {1,3,4,2,6,9,7};
        int target = 6; 
        int n = a.length;

        System.out.println(search(a, n, target, 0));
    }
}
 