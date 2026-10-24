// LeetCode Problem: Subarray Sums Divisible by K
// Link: https://leetcode.com/problems/subarray-sums-divisible-by-k/
// Difficulty: Medium
// Language: java

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       Map<Integer,Integer> remainderCount = new HashMap<>();
       remainderCount.put(0,1);
       int prefixSum = 0;
       int count = 0;
       for(int num  : nums)
       {
        prefixSum += num;
        int remainder =((prefixSum % k) + k ) % k;
        count += remainderCount.getOrDefault(remainder,0);
        remainderCount.put(remainder,remainderCount.getOrDefault(remainder,0) + 1);
       }
       return count;

    }
}