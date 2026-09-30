class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int m : nums){
            min = Math.min(min,m);
        }
        return min;
    }
}
