// LeetCode Problem: Number of Sub-arrays With Odd Sum
// Link: https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/
// Difficulty: Medium
// Language: java

class Solution {
    public int numOfSubarrays(int[] arr) {
        int prefixSum = 0;
        int even = 1;
        int odd = 0;
        int ans = 0;
        for(int num : arr){
            prefixSum += num;
            if(prefixSum %2 == 0){
                ans += odd;
                even++;
            }else{
                ans += even;
                odd++;
            }
            ans %= 1000000007;

        }
        return ans;
    }
}