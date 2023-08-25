/**
 * SeperateDigit
 */
public class SeperateDigit {
    public static int reverseInteger(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            int co = num / 10;
            num = co;
            rev = (rev * 10) + rem;
        }
        return rev;
    }

    public static int lengthOfInteger(int num) {
        int length = 0;
        // calculate number length
        while (num > 0) {
            int co = num / 10;
            num = co;
            length++;
        }
        return length;
    }

    public static int[] seperateDigit(int arr[]) {
        int length = 0;
        // calculate array length
        for (int num : arr) {
            length += lengthOfInteger(num);
        }

        int result[] = new int[length];
        int index = 0;
        for (int i : arr) {
            int num = reverseInteger(i);
            while (num > 0) {
                int rem = num % 10;
                int co = num / 10;
                num = co;
                result[index] = rem;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 174, 257, 23 };
        int result[] = seperateDigit(arr);
        for (int i : result) {
            System.out.println(i);
        }

    }
}