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

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printSpiral(matrix);
    }
}