// // class Solution {
// //     public int[] twoSum(int[] nums, int target) {
// //         int start =0,end=nums.length-1;
// //         ArrayList<Integer> bleh = new ArrayList<>();
// //         while (start<end){
// //         int comp = target - nums[start];
// //         for(int i =start+1;i<end;i++){
// //             if(nums[i]==comp){
// //                 return new int[]{start, i};
// //             }
// //             start++;
// //         }
// //         }
// //         return new int[]{-1,-1};
// //     }
// // }
// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         int start = 0;
//         int end = nums.length;

//         while (start < end) {

//             int comp = target - nums[start];

//             for (int i = start + 1; i < end; i++) {
//                 if (nums[i] == comp) {
//                     return new int[]{start, i};
//                 }
//             }

//             start++;
//         }

//         return new int[]{-1, -1};
//     }
// }

class Solution{
    public int[] twoSum(int[] nums,int target){
            if(nums.length==2){
                return new int[]{0,1};
            }
            Map<Integer,Integer> indMap = new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++){
                if(indMap.containsKey(target-nums[i])){
                    return new int[]{indMap.get(target-nums[i]),i};
                }
                else{
                    indMap.put(nums[i],i);
                }
            }


        return new int[]{};
    }
}

