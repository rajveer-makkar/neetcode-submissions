class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int x = 0;
        
        int[] arr = new int[nums.length - k + 1];
        
        while (left <= nums.length - k) {
            int right = left + k;
            int max = nums[left];
            
            for (int i = left; i < right; i++) {
                max = Math.max(max, nums[i]);
            }
            
            arr[x++] = max;
            left++;
        }
        
        return arr;
    }
}