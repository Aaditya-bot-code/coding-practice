// LeetCode Problem: H-Index
// Link: https://leetcode.com/problems/h-index/
// Difficulty: Medium
// Language: java

class Solution {
    public int hIndex(int[] citations) {
       Arrays.sort(citations);
       int n = citations.length;
       int maxValid = 0;
       for(int i = 0 ; i < n ; i++)
       {
        if(citations[i] >= n - i)
        {
            maxValid = Math.max(maxValid,n - i); 
        }
       }
       return maxValid; 
    }
}