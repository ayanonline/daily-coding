class SumOfDigit {
    static void calcSumOfDigit(int num) {
        int myNum = num;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of " + myNum + " is " + sum);
    }

    public static void main(String[] args) {
        calcSumOfDigit(555);
    }
}