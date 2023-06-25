public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) { // when start & end will same

            int mid = (start + end) / 2; // finding the mid

            if (arr[mid] == key) { // found
                return mid;
            } else if (arr[mid] > key) { // left
                end = mid - 1;
            } else { // right
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int myArr[] = new int[] { 12, 22, 33, 36, 55, 66 };
        System.out.println("Key found at index: " + binarySearch(myArr, 99));
    }
}
