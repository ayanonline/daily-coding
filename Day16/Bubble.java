class Bubble {

    // bubble sorting
    public static int[] doBubbleSort(int arr[]) {
        int n = arr.length;
        // outer loop for turn
        for (int turn = 0; turn < n - 1; turn++) {
            int swap = 0;
            for (int i = 0; i < n - 1 - turn; i++) {

                if (arr[i] > arr[i + 1]) {
                    // swap
                    swap++;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if (swap < 1) {
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int array[] = { 2, 10, 6, 7, 8 };
        for (int i : doBubbleSort(array)) {
            System.out.println(i);
        }
    }
}