// LeetCode Problem: Contiguous Array
// Link: https://leetcode.com/problems/contiguous-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int findMaxLength(int[] nums) {
      Map<Integer,Integer> firstIndex = new HashMap<>();
      firstIndex.put(0,-1);
      int balance = 0;
      int maxLength = 0;
      for(int i = 0 ; i < nums.length ; i++)
      {
            if(nums[i] == 0)
            {
                balance -= 1;
            }
            else{
                balance += 1;
            }
            if(firstIndex.containsKey(balance))
            {
                maxLength = Math.max(maxLength, i - firstIndex.get(balance));
            }
            else
            {
            firstIndex.put(balance,i);
            }
      }
      return maxLength;

    }
}