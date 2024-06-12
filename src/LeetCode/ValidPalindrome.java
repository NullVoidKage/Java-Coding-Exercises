package LeetCode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "*NAAN *";
        if(isPalindrome(s)) {
            System.out.println("PALINDROME NGA!");
        } else  {
            System.out.println("HINDI PALINDROME");
        }

    }

    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s).reverse();

        if(s.equalsIgnoreCase(String.valueOf(stringBuilder))) {
            return true;
        }

        return false;

    }
}
