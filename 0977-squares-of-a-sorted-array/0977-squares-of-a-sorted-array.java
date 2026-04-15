 class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int head = 0;
        int tail = len - 1;
        int[] res = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            if (nums[head] > nums[tail]) {
                res[i] = nums[head];
                head++;
            } else {
                res[i] = nums[tail];
                tail--;
            }
        }
        return res;
    }
}
