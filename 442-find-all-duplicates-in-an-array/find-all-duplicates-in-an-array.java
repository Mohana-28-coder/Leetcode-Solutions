class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            // Already visited
            if (nums[index] < 0) {
                result.add(index + 1);
            }

            // Mark as visited
            nums[index] = -nums[index];
        }

        return result;
    }
}