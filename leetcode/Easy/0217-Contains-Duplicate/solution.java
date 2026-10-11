// LeetCode Problem: Contains Duplicate
// Link: https://leetcode.com/problems/contains-duplicate/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int num : nums)
        {
            if(!frequency.containsKey(num))
            {
                frequency.put(num,1);
            }
            else{
            if(frequency.get(num) == 1)
            {
                return true;
            }
            }
        }
        return false;
    }
}