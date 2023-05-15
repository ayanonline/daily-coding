public class PrimeInRange {

    static void primesInRange(int range) {

        for (int i = 2; i <= range; i++) {
            if (Prime.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        primesInRange(100);
    }
}
