package Exercises;


public class ReverseString {

    public static void main(String[] args) {
        String str = "123";

        reverseCowGirl(str);
        reverse(str);
    }

    public static String reverse(String in) {
        if (in == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder out = new StringBuilder();

        char[] chars = in.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();
    }

    public static void reverseCowGirl(String string) {

        int length = string.length();
        String name="";

        for(int i=length-1;i>=0;i--) {
            System.out.print(string.charAt(i));
        }
    }
}