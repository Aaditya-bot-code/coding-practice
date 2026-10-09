// LeetCode Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0; i<nums.length;i++)
       {
        int current = nums[i];
        int difference = target-current;
        if(map.containsKey(difference))
        {
            return new int[]{map.get(difference),i};
        }
        else{
            map.put(nums[i],i);
        }
       } 
       return new int[]{};

    }
}