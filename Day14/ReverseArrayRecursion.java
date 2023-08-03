public class ReverseArrayRecursion {
    public static int[] reverseArrrayRecursion(int arr[], int start, int end) {
        if (start > end) {
            return arr;
        }
        // swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // change value of start & end
        start++;
        end--;
        // call recursion
        reverseArrrayRecursion(arr, start, end);

        return arr;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        ReverseArray.printArray(reverseArrrayRecursion(array, 0, 4));
    }
}
