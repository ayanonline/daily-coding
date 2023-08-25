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

    public static int[] insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // jotokhon na prev ta 0 hoe jaccha r curr ta prev r theka choto
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev]; // jodi prev element ta boro hoi current r theka tahola 1ta step pichone
                                           // shift kore debo
                prev--;
            }
            // akhana current element ta place kore debo
            arr[prev + 1] = curr; // prev+1 because after the while loop end prev will be -1
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
        printArray(insertionSort(array));

    }
}