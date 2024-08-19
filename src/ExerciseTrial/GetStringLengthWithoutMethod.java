package ExerciseTrial;

import java.util.Arrays;

public class GetStringLengthWithoutMethod {
    public static void main(String[] args) {
        toString("NAszAs asNI");
    }

    public static void toString(String name) {
        int count = 0;
        for(char c: name.toCharArray()) {
            System.out.print(c + " | ");
            count++;
        }
        System.out.println(count);
    }


    private static boolean isAnagram(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

        if(a1==b1){
            return true;
        }
        return false;
        // Complete the function
    }
}
