package LeetCode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        if (isAnagram("anagram", "nagaram")) {
            System.out.println("TRUE");
        }

    }

    public static boolean isAnagram(String s, String t) {
        System.out.println(s.length());
        System.out.println(t.length());
        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}
