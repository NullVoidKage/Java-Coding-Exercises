package ExerciseTrial;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class IntermediateExercise {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[] arr = {5, 41, 121, 32, 41, 4, 50};
//        containsDuplicate(arr);
//        if(validAnagram("NANI", "NINAS")) {
//            System.out.println("VALID ANAGRAM");
//        } else {
//            System.out.println("NOT VALID");
//        }
//        sortNumber();
//        selectionSort();
//        findValueInList();
        sortNumber();
        long endTime = System.currentTimeMillis();

        // Calculate the elapsed time
        long elapsedTime = endTime - startTime;
        System.out.println("\nElapsed time: " + (double) elapsedTime / 1000 + " seconds");

    }

    private static void findValueInList() {
        int[] number = {11, 42, 12, 43, 99, -1};
        Arrays.sort(number);
        int target = -1;
        for (int k : number) {
            if (target == k) {
                System.out.println("TARGET FOUND");
            }
            System.out.println(k);
        }

        String[] names = {"NANI", "NINA", "GAGI", "LOLS"};
        String targetName = "LOLS";
        for (String s : names) {
            if (targetName.equals(s)) {
                System.out.println("TARGET LOCK");
            }
        }

        String name = "TARUB";
        char[] burat = name.toCharArray();
        for(int i = name.length()-1; i >= 0;i--){
            System.out.print(burat[i]);

        }

        System.out.println();
        for(int i = 0;i<names.length;i++){
            for(int j = i-1;j>0;j--) {
                char[] reverse = names[i].toCharArray();

                System.out.println(reverse[i]);
            }
        }


    }
    private static void selectionSort() {
        int[] number = {10, 100, 1, 4, -1, 55};
        int size = number.length;
        int value = 0;
        for (int i = 0; i < size - 1 ; i++) {
            int minIndex = i; //0 = 10
            for(int j=i+1;j < size;j++) {
               if (number[j] < number[minIndex]) {
                   minIndex = j;
               }
            }
            int temp = number[i];
            number[i] = number[minIndex];
            number[minIndex] = temp;
            value = number[minIndex];
        }
        System.out.println(value + " : VALUE");

    }
    private static void sortNumber() {
        int[] arr = {5, 12, 6, 10};
        int n = arr.length;
        int value = 0;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            value = arr[minIndex];
        }
        System.out.println(value + " : VALUE");
    }
    private static boolean containsDuplicate(int[] number) {
        Arrays.sort(number);
        for(int i=1;i<number.length;i++){
            System.out.println(number[i] + " " + number[i - 1]);
            //number[0] = 4
            //number[
            if(number[i] == number[i-1]){
                System.out.println("DUPLICATE");
                return true;
            }
        }
        return false;

    }
    private static boolean validAnagram(String A1, String A2) {
        if(A1.length()!=A2.length()) {
            return false;
        }
        char[] charArray1 = A1.toCharArray();
        char[] charArray2 = A2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

}
