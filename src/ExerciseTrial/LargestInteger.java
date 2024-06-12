package ExerciseTrial;

import java.util.Arrays;

public class LargestInteger {
    public static void main(String[] args) {
        int[] nums = {5, 8, 4, 5, 11, 2};
        largestNums(nums);
    }

    private static void largestNumber(int[] number) {
        int left = 0;
        int right = number.length - 1;
        int target = 1;

        while (left < right) {
            if(target == number[left]) {
                System.out.println("TARGET LOCK LEFT " +number[left]);
            } else if(target == number[right]) {
                System.out.println("TARGET LOCK RIGHT " +number[right]);
            }
            left++;
            right--;
//            if(number[left] < number[right]) {
//
//                left++;
//                right--;
//            }
        }
    }

    private static void largestNums(int[] nums){
        int length = nums.length;
        int start = 0;
        int last = length - 1;
        int iNums;
        int jNums;
//        Arrays.sort(nums);
//        System.out.println(nums[length-1]);
        int value;
        for(int i=0;i<length;i++) {
            for(int j=i+1;j<length;j++) {
                if(nums[i]>nums[j]) {
                    value=nums[i];
                    System.out.println(value + " : I");

                } else if(nums[j]>nums[i]) {
                    value=nums[j];
                    System.out.println(value + " : J");

                }
            }
        }
    }
}
