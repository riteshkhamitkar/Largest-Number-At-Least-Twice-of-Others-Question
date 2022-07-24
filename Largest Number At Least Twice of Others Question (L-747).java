class Solution {
    public int dominantIndex(int[] nums) {
        
        int largest = 0;
        int index = -1;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] >= 2*largest){
                index = i;
                largest = nums[i];
            }else if(nums[i] >= largest){
                index = -1;
                largest = nums[i];
            }else if(nums[i] > largest / 2){
                index = -1;
            }
        }
        return index;
    }
}