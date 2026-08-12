class Solution {
    public int maxSubArray(int[] nums) {
        int N=nums.length;
        int max=nums[0];
        int sum=nums[0];
        for(int i=1;i<N;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(max,sum);
        }  
        return max;
    }
}
