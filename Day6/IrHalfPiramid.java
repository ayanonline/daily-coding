public class IrHalfPiramid {
    public static void inveted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {

            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // for first invisible one
        inveted_rotated_half_pyramid(4);
    }
}
