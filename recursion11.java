public class recursion11 {
    public static void main(String[] args) {
        int arr[] = {1,4,2,7,9,6};

        System.out.println(maxArray(arr, 0));

    }

    static int maxArray(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int smallAns1 = maxArray(arr, idx+1);

        return Math.max(smallAns1, arr[idx]);
    }
}