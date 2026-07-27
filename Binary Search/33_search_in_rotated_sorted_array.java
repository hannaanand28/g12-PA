class Solution {
    public int search(int[] nums, int target) {
        int low =0, high = nums.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            
            // phle hum low side check kr rhe h ki sorted h ya nhi
            if(nums[low]<=nums[mid]){
                // ye agar low side h toh target mid se low ke beech mai h toh high ko shift kr rhe h
                if(target>=nums[low] && target <=nums[mid]){
                    high = mid-1;
                }
                // vrna low ko 
                else{
                    low=mid+1;
                }
            }
            // yahan high side check kr rhe h
            else{
                if(target<=nums[high] && target > nums[mid]){
                    low=mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}