package stream;

import java.util.Arrays;

public class LengthOfLastWorld {
    public static void main(String[] args) {
        String hW = "   fly me   to   the moon  ";
        lengthOfLastWordOptimize(hW);
    }
    public static int lengthOfLastWordBruteForce(String s) {
        StringBuilder stringBuilder = new StringBuilder(s).reverse();
        String toString = stringBuilder.toString();
        String trim = toString.trim();
        String[] words = trim.split("\\W+"); // Splitting by non-word characters
        System.out.println(words[0].length());

        return words[0].length();
    }

    public static int lengthOfLastWordOptimize(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();
        // Find the index of the last space in the string
        int lastSpaceIndex = s.lastIndexOf(' ');
        System.out.println(lastSpaceIndex);
        System.out.println(lastSpaceIndex);
        // If there's no space, return the length of the entire string
        if (lastSpaceIndex == -1) {
            return s.length();
        }


        // Return the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }

}
