// LeetCode Problem: Subarray Sum Equals K
// Link: https://leetcode.com/problems/subarray-sum-equals-k/
// Difficulty: Medium
// Language: java

class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> prefixCount = new HashMap<>();
       int prefixSum = 0 ;
       int count = 0 ;
       prefixCount.put(0,1);
       for(int num : nums)
       {
        prefixSum += num;

        int required = prefixSum  - k;
        count += prefixCount.getOrDefault(required,0);

        prefixCount.put(prefixSum,prefixCount.getOrDefault(prefixSum,0)+1);
       }
       return count;

    }
}