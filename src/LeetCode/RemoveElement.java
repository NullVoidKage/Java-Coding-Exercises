package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int target = 3;
        removeElement(nums, target);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length ;i++) {
            if(nums[i]!=val) {
                nums[count] = nums[i]; //Ilalagay yung value ng nums[i] sa nums[count]=0
                //1. nums[count] = 0, nums[i] = 3
                //count++ 0
                //2. nums[count] = 1, nums[i] = 2
                //counts++ 1
                //3. nums[counts] = 2, nums[i] = 2
                //counts++ 2
                //4. nums[counts] = 3, nums[i] = 3
                //counts++ 3
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
