
// MAINLY THIS QUESTION WAS SIMILAR TO MOVING ZEROS 

class Solution {
    public int[] function(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] *2;
                nums[i+1] = 0;
            }
            else{
                continue;
            }
        }
        return nums;
    }
    public int[] applyOperations(int[] nums) {
        int[] arr = function(nums);
        int slow = 0;
        for(int fast=0;fast < arr.length;fast++){
            if(arr[fast]!=0){
                int temp = arr[slow];
                arr[slow]=arr[fast];
                arr[fast]=temp;
                slow++;
            }
        }
        return arr;
        }
    }
