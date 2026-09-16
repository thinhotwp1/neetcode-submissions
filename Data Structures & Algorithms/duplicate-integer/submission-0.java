class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicateCheck = new HashSet();
        for (int num : nums) {
            if (!duplicateCheck.add(num))
                return true;
        }

        return false;
    }
}