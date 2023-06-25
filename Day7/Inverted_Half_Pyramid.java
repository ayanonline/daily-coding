class Inverted_Half_Pyramid {
    public static void inverted_Half_Pyramid(int line) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= (line - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_Half_Pyramid(5);
    }
}