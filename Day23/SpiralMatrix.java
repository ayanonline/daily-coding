class SpiralMatrix {
    public static void printSpiral(int arr[][]) {
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = arr.length - 1;
        int endingCol = arr[0].length - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            // j for column & i for row
            // Top
            for (int j = startingCol; j <= endingCol; j++) {
                System.out.print(arr[startingRow][j] + " ");
            }

            // Right
            for (int i = startingRow + 1; i <= endingRow; i++) {
                System.out.print(arr[i][endingCol] + " ");
            }

            // Bottom
            for (int j = endingCol - 1; j >= startingCol; j--) {
                if (startingRow == endingRow)
                    break;
                System.out.print(arr[endingRow][j] + " ");
            }

            // Left
            for (int i = endingRow - 1; i >= startingRow + 1; i--) {
                if (startingCol == endingCol)
                    break;
                System.out.print(arr[i][startingCol] + " ");
            }
            startingRow++;
            startingCol++;
            endingRow--;
            endingCol--;
        }
    }

    public static int diagonalSum(int arr[][]) {
        int sum = 0;
        int n = arr.length;
        // for (int i = 0; i < arr.length; i++) { // O(n^2)
        // // Primary diagonal sum
        // for (int j = 0; j < arr.length; j++) {
        // if (i == j) {
        // sum += arr[i][j];
        // }
        // // secondary diagonal sum
        // else if (i + j == arr.length - 1) {
        // sum += arr[i][j];
        // }
        // }
        // }

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += arr[i][i];
            // Secondary diagonal i+j=n-1 -> j=n-1-i
            int j = n - 1 - i;
            if (i != j)
                sum += arr[i][j];

        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 5, 6, 7, },
                { 9, 10, 11 }
        };
        // printSpiral(matrix);
        System.out.println(diagonalSum(matrix));
    }
}