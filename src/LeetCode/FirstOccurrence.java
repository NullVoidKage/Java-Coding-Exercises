package LeetCode;

import java.util.Arrays;
import java.util.Objects;

public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        int length = haystack.length();
        if(haystack.charAt(0)!=needle.charAt(0)) {
            System.out.println("NEGATIVE 1");
            return -1;
        }

        for(int i=0;i<length;i++) {
            if(needle.charAt(i)==haystack.charAt(i)) {
                i++;
                return 0;
            } else {
                break;
            }
        }
        return -1;

    }
}
