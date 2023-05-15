public class PlindromeNumber {

    static boolean isPalindrome(int num) {
        int myNum = num;
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        if (myNum == reverse) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }

}
