public class SubArray {
    public static void printSubArray(int arr[]) {
        int ts = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " "); // subarray
                }
                ts++;
                System.out.println();
                System.out.println("sum of this subArray is = " + sum);

                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total subarray = " + ts);
        System.out.println("min = " + min + " and max = " + max);
    }

    public static void main(String[] args) {
        int myArr[] = { 1, -2, 6, -1, 3};
        printSubArray(myArr);
    }
}
