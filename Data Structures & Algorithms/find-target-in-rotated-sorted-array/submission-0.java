class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        for(int num: nums){
            if(target==num) return i;
            i++;
        }
        return -1;
    }
}
