public class LargestFormArray {

    public static int findLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int myArr[] = new int[] { 3, 2, 6, 12, 90, 4, 2, 100 };
        System.out.println("The Largest Number is " + findLargest(myArr));
    }
}
