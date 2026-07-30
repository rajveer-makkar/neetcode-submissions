class Solution {
    public boolean hasDuplicate(int[] nums) {
        int flag =0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (j==i) continue;
                if(nums[i]==nums[j]){
                    flag=1;
                    break;
                }
            }
        }
        return flag==1;
    }
}