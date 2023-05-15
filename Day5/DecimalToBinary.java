public class DecimalToBinary {
    static void calcDecimalToBinary(int decimal) {
        int myNum = decimal;
        int binary = 0, pow = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            decimal = decimal / 2;
            pow++;
        }
        System.out.println("Binary form of " + myNum + " is = " + binary);
    }

    public static void main(String[] args) {
        calcDecimalToBinary(10);
    }
}
