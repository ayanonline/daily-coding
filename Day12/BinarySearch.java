public class BinarySearch {
    public static int search(int arr[], int key) {
        // initialize the start and end
        int start = 0, end = arr.length - 1;

        // while start is less than equal to end
        while (start <= end) {
            // find out the mid
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) { // check right
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(search(arr, 5));
    }
}
