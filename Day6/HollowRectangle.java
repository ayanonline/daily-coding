/**
 * HollowRectangle
 */
public class HollowRectangle {

    public static void main(String[] args) {
        int row = 4, col = 5;
        // outer loop for line or rows
        for (int i = 1; i <= row; i++) {
            // inner loop for column
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}