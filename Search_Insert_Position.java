class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int position=0, cn=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                position=i;
                break;
            }
            else if(nums[i]>target){
                position=i;
                break;
            }
            cn++;
        }
        if(cn==nums.length){
            position=nums.length;
        }
        return position;
    }
}
