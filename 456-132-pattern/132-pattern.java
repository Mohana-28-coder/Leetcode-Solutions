class Solution {
    public boolean find132pattern(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        int third = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = nums.length - 1; i >= 0; i--) {

            // nums[i] is the "1" in 132 pattern
            if (nums[i] < third) {
                return true;
            }

            // Maintain decreasing stack
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop();
            }

            stack.push(nums[i]);
        }

        return false;
    }
}