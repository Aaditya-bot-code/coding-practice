// LeetCode Problem: Merge Intervals
// Link: https://leetcode.com/problems/merge-intervals/
// Difficulty: Medium
// Language: java

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b) ->Integer.compare(a[0],b[0]));
       List<int[]> result = new ArrayList<>();
       if(intervals.length == 0)
       {
        return new int[0][];
       }
       result.add(intervals[0]);
       for(int i = 1 ; i < intervals.length ; i++)
       {
        int[] current = result.get(result.size()-1);
        int[] next = intervals[i];
        if(next[0] <= current[1])
        {
            current[1] = Math.max(current[1],next[1]);
        }
        else{
            result.add(next);
        }
       }
       return result.toArray(new int[result.size()][]);

    }
}