// LeetCode Problem: Maximize Consecutive Elements in an Array After Modification
// Link: https://leetcode.com/problems/maximize-consecutive-elements-in-an-array-after-modification/
// Difficulty: Hard
// Language: java

class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> dp = new HashMap<>();
        int ans = 0;
        for(int x : nums){
            int prevX = dp.getOrDefault(x,0);
            int prevXMinus1 = dp.getOrDefault(x - 1, 0);
            int prevXPlus1 = dp.getOrDefault(x + 1, 0);

            int keep = Math.max(prevX, prevXMinus1 + 1);
            int increase = Math.max(prevXPlus1, prevX + 1);

            dp.put(x, keep);
            dp.put(x + 1, increase);

            ans = Math.max(ans, Math.max(keep, increase));
        }
        return ans;
    }
}