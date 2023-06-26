class Binary {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            // find mid
            int mid = (start + end) / 2;
            // first check the mid == key?
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) { // check left
                end = mid - 1;
            } else {
                start = mid + 1; // check right
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int myArr[] = { 12, 33, 45, 65, 78, 90 };
        System.out.println("Key found at index: " + binarySearch(myArr, 90));
    }
}