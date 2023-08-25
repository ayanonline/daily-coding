public class MergeSort {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // kam
        // find out the mid
        int mid = si + (ei - si) / 2; // (si+ei)/2

        // left part which start from si and end mid;
        mergeSort(arr, si, mid);// left part
        // right part which start from mid+1 and end ei
        mergeSort(arr, mid + 1, ei);// right part

        // Weneed to merge left & right part
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // we need to create an temp array
        // left(0,3)=4 right(4,6)=3 -> 6-0+1=7
        int temp[] = new int[ei - si + 1];
        int i = si; // left iterator
        int j = mid + 1; // right iterator
        int k = 0; // temp iterator

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // for left rest elements
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // for right rest elements
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, -2, 0 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}