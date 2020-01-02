class Solution {
    public static int maxProduct(int[] nums) {
        int len = nums.length;

        int min = nums[0];
        int max = nums[0];
        int finalMax = nums[0];

        if (len == 1) {
            return nums[0];
        }

        for (int i = 1; i < len; i++) {
            // If negative, swap max and min
            if (nums[i] < 0) {
                int tmp = min;
                min = max;
                max = tmp;
            }

            // Generate max and min for this loop
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            // If local max > finalMax, update finalMax 
            finalMax = Math.max(finalMax, max);
        }

        return finalMax;
    }

    // Driver for testing this problem
    public static void main(String[] args) {
        int test[] = { -4, 1, 4, 58 };
        int answer = maxProduct(test);
        System.out.println("Largest product of a contiguous subarray: " + answer);
    }
}