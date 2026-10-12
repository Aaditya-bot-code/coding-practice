// LeetCode Problem: Find Numbers with Even Number of Digits
// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Difficulty: Easy
// Language: java

class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for( int i = 0 ; i < nums.length ; i++)
        {
            int countDigit = 0;
            while(nums[i] > 0)
            {
                countDigit += 1;
                nums[i] = nums[i]/10;
            }
            if(countDigit % 2  == 0)
            {
                evenCount +=1;
            }
        }
        return evenCount;
    }
}