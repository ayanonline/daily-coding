import java.util.Arrays;

public class Duplicate {
    public static boolean isDuplicate(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int array[] = { 4, 3, 6, 5, 7 };
        System.out.println(isDuplicate(array));
    }
}