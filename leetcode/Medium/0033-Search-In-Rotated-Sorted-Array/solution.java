// LeetCode Problem: Search in Rotated Sorted Array
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left ) / 2;
            if(target == nums[mid])
            {
                return mid;
            }
            if(nums[left] <= nums[mid])
            {
                if(target >= nums[left] && target < nums[mid])
                {
                    right= mid - 1;
                }
                else{
                    left= mid + 1;
                }
            }
            else{
                if(target <= nums[right] && target > nums[mid])
                {
                    left= mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}