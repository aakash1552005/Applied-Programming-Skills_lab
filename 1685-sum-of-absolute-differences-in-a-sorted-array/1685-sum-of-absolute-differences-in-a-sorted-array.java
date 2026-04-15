class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        long totalSum = 0;
        for (int x : nums) {
            totalSum += x;
        }

        long prefixSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= nums[i]; // now totalSum represents sum right of i
            long leftDiff = (long) i * nums[i] - prefixSum;
            long rightDiff = totalSum - (long) (n - i - 1) * nums[i];
            result[i] = (int) (leftDiff + rightDiff);
            prefixSum += nums[i];
        }
        return result;
    }
}
