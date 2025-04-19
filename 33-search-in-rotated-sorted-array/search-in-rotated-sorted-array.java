class Solution {
    public int search(int[] nums, int target) {
        int result=search(nums,target,0,nums.length-1);
        return result;
    }
    public int search(int[] nums,int target,int start,int end ){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[start]<=nums[mid]){
            if(target>=nums[start] && target<=nums[mid]){
                return search(nums,target,start,mid-1);
            }
            else{
                return search(nums,target,mid+1,end);
            }
        }
        if(target>=nums[mid] && target<=nums[end]){
            return search(nums,target,mid+1,end);
        }
        else{
            return search(nums,target,start,mid-1);
        }
    }
}