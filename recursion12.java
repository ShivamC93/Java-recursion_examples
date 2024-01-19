public class recursion12 {
    //sum of element of array
    public static void main(String[] args) {
        int arr[] = {1,3,5,9,6};
        System.out.println(SumOfArr(arr, 0));

    }

    static int SumOfArr(int arr[], int idx){
        if (idx == arr.length - 1){
            return 0;
        }

        int SmallAns = SumOfArr(arr, idx+1);

        return SmallAns + arr[idx];
    }
}
