class Solution {
    public int maxSubArray(int[] nums) {
        int cur=nums[0];
        int maxsub=nums[0];
        for(int i=1;i<nums.length;i++){
            cur=Math.max(nums[i],cur+nums[i]);
            maxsub=Math.max(maxsub,cur);
        }
        return maxsub;
    }
}