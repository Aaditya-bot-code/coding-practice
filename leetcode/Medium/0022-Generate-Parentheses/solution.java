// LeetCode Problem: Generate Parentheses
// Link: https://leetcode.com/problems/generate-parentheses/
// Difficulty: Medium
// Language: java

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(n, "", 0, 0,result);
        return result;

    }
    private void backTrack(int n, String current , int open , int close, List<String> result)
    {
        if(current.length() == 2*n)
        {
            result.add(current);
            return;
        }
        if(open <n)
        {
            backTrack(n,current + "(", open + 1, close, result);
        }
        if(close < open)
        {
            backTrack(n, current+ ")", open, close + 1, result);
        }
    }
}