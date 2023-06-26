public class ReverseAssendingArray {

    // this reverse will only work on 'assending ordered sorted' array
    public static void reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            // swap first element with last element of array
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; // increase the start after swap
            end--; // decrease the end after swap
        }
    }

    // display function for array
    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int myArr[] = { 2, 4, 5, 6, 7, 8, 9 };
        System.out.println("Before reverse");
        displayArray(myArr);
        reverseArray(myArr);
        System.out.println("After reverse");
        displayArray(myArr);
    }
}
