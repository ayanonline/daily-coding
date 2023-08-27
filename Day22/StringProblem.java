/**
 * StringProblem
 */
public class StringProblem {

    public static void main(String[] args) {
        try {
            String s = "I am Ayan Ghosh ";
            System.out.println(s.charAt(0));
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ' && i + 1 < s.length()) {
                    System.out.println(s.charAt(i + 1));
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}