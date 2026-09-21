class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int left = 0; left < nums.length; left++) {
        int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target)
                    return new int[] {left, right};
                else{
                    right--;
                }
            }
        }
        return new int[] {0, 0};
    }
}
