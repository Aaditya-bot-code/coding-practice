// LeetCode Problem: Kth Largest Element in an Array
// Link: https://leetcode.com/problems/kth-largest-element-in-an-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> minHeap = new PriorityQueue<>();
       for(int num : nums)
       {
        minHeap.offer(num);
        if(minHeap.size() > k)
        {
            minHeap.poll();
        }

       } 
       return minHeap.peek();
    }
}