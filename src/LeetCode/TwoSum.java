package LeetCode;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums =  {0, 2, 4, 5};
        twoSum.twoSum(nums, 9);
//        System.out.println(twoSum.twoSum(nums, 9));
    }


    public int[] twoSum(int[] nums, int target) {
        // {0, 2, 4, 5}
        // target = 9
        // [2, 3]

        for (int i = 0; i < nums.length-1;i++) {
            for (int j = i + 1; j < nums.length ; j++){
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};

    }
}


