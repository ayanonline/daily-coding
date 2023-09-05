public class ValidPalindrome {

    public static boolean checkPalindrome(String s) {
        // return true if the string is empty
        if (s.isEmpty())
            return true;
        int left = 0;
        int right = s.length() - 1;

        // traverse the string from both side at a time and compare with each other

        while (left < right) {
            // first check that the character is alphanumeric or not
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            } else {
                left++;
                right--;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("A man, a plan, a canal: Panama"));
    }
}