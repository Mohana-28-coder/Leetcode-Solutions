class Solution {
    public int removeDuplicates(int[] nums) {

        // If array length is 2 or less, it's already valid
        if (nums.length <= 2) return nums.length;

        int k = 2; // first two elements are always allowed

        for (int i = 2; i < nums.length; i++) {
            // Compare current number with the number two positions before
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
