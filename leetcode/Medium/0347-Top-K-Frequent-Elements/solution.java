// LeetCode Problem: Top K Frequent Elements
// Link: https://leetcode.com/problems/top-k-frequent-elements/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->
                                            Integer.compare(map.get(b),map.get(a)));
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        for(int num : map.keySet()){
            pq.add(num);
        }
        int []ans = new int[k];
        for(int i =0; i < k; i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}