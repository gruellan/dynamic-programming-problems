class Solution {
    public static int maxSubArray(int[] nums) { 
        int max = nums[0];
        int sum = nums[0];
        
        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String args[]) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        int ans = maxSubArray(input); 

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + ans);
    }
}
