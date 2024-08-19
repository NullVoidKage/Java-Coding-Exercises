package LeetCode;

import java.util.Arrays;

public class PalindromeNumber {
    public static void main(String[] args) {
        if(palindrome3(100021)) {
            System.out.println("PALINDROEM");
        }
        if(palindrome2(1000021)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT");
        }
    }

    public static boolean isPalindrome(int x) {
        char[] num  = String.valueOf(x).toCharArray();
        if(x < 0) {
            return false;
        }

        if(num[0]!=num[num.length-1]) {
            return false;
        }
        char[] chars = new char[num.length];

        for(int i= num.length-1;i>=0;i--) {
            chars[i] = num[i];
        }

        if(Arrays.equals(chars, num)){
            System.out.println("TRUE");
            return true;
        }

        //121 = 121
        //Convert the int to array
        //Reverse the array
        //Add to new var
        //compare if its equals
        //if equals return true
        //if not return false
        return false;
    }

    private static boolean palindrome2(int x) {
        String numString = String.valueOf(x);
        int left = 0;
        int right = numString.length() - 1;

        while (left < right) {
            if (numString.charAt(left) != numString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean palindrome3(int x) {
        int[] num;
        int digits = (int) Math.log10(x) + 1;

        for (int i=digits-1;i>=0;i--) {
            System.out.println(x);
        }
        return true;
    }
}
