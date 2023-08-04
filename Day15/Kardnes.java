class Kardnes {

    public static int kardnes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        // for all negative numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                maxSum = Math.max(maxSum, arr[i]);
            } else {
                maxSum = Integer.MIN_VALUE;
                for (int j = 0; j < arr.length; j++) {
                    curSum += arr[j];
                    // if curSum is negative then make it zero
                    if (curSum < 0) {
                        curSum = 0;
                    }
                    // compare with maxSum
                    maxSum = Math.max(curSum, maxSum);
                }
                break;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int array[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(kardnes(array));

    }
}