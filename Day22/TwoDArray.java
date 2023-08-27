import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int numOfRow = matrix.length, numOfCol = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numOfRow; i++) {
            for (int j = 0; j < numOfCol; j++) {
                System.out.print("Enter the value of " + i + ", " + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numOfRow; i++) {
            for (int j = 0; j < numOfCol; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
