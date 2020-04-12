/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    int i, j = 0;
    int sum = 0;
    int[] arr = new int[2];
    
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length; 
        for(int i = 0; i < (n - 1); i++){
            for(int j = (i + 1); j < n; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    arr = new int[]{i, j};
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        Solution solution = new Solution();
        solution.twoSum(nums, 9);
        // System.out.println(i + j);             
    }
}
// @lc code=end

// Accepted
// 29/29 cases passed (95 ms)
// Your runtime beats 5.08 % of java submissions
// Your memory usage beats 5.65 % of java submissions (40 MB)
