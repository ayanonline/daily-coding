// Reverse an array using loop

class ReverseArray {

    public static int[] reverseArrray(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // change the value of end & start
            start++;
            end--;
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        printArray(reverseArrray(array));

    }
}