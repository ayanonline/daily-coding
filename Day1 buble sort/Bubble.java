package sorting;

/**
 * Bubble
 */

/**
 * InnerBubble
 */
class InnerBubble {
    int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // this loop for perform the sorting 6 times

            // this loop for check and swap
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}

public class Bubble {

    public static void main(String[] args) {
        int myArray[] = { 47, 25, 89, 2, 6, 4, 32 };

        InnerBubble obj = new InnerBubble();
        int arr[] = obj.bubbleSort(myArray);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}