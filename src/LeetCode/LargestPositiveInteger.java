package LeetCode;

import java.util.Arrays;

public class LargestPositiveInteger {
    public static void main(String[] args) {
        int[] nums = {1,10,6,7,-8,-7,1};

        System.out.println(findMaxK(nums));
    }

    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
//        System.out.println(sortNumber(nums));
        return nums[nums.length-1];



    }

    private static int[] sortNumber(int[] arr) {
        int length = arr.length;

        for(int i = 0;i<length;i++){
            int minIndex = i; //0
            for(int j = i+1;j<length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
