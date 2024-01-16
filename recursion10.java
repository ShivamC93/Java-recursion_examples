public class recursion10 {
    static void printArray(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }

        System.out.println(arr[idx]);

        printArray(arr, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        printArray(arr, 0);
    }
}
