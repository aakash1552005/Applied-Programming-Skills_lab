class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
