public class BinaryToDecimal {
    static void binaryToDecimal(int num) {
        int myNum = num;
        int dec = 0, pow = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            num = num / 10;
            pow++;
        }
        System.out.println("Decimal of " + myNum + " is " + dec);
    }

    public static void main(String[] args) {
        binaryToDecimal(1111);
    }
}
