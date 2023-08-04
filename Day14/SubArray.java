public class SubArray {

    public static int maxSubArraySum(int arr[]) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int curSum = 0;
                for (int k = start; k <= end; k++) {
                    curSum += arr[k];
                }
                if (curSum > maxSum) {
                    maxSum = curSum;
                }
                System.out.println(curSum);

            }
        }
        return maxSum;
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        int prefix[] = new int[nums.length];
        // calc prefix
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;

                curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (curSum > maxSum) {
                    maxSum = curSum;
                }
                System.out.println(curSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int array[] = { 5, 4, -1, 7, 8 };
        System.out.println(maxSubArray(array));
    }
}
