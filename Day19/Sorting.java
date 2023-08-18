public class Sorting {
    public static int[] selectionSort(int[] arr) {

        // outer loop
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                // finding the smallest element
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            // Swap the minPos element with ith element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };
        printArray(selectionSort(array));

    }
}