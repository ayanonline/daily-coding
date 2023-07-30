/**
 * ThreeSum
 */
public class ThreeSum {

    public static String printThreeSum(int arr[], int sum) {
        String result = "Don't Exist";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int add = arr[i] + arr[j] + arr[k];
                    if (add == sum) {
                        result = "Exits: " + arr[i] + ", " + arr[j] + ", " + arr[k];
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int array[] = { 12, 3, 4, 1, 6, 9 };
        System.out.println(printThreeSum(array, 16));
    }
}