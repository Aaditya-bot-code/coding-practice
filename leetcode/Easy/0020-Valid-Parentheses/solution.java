// LeetCode Problem: Valid Parentheses
// Link: https://leetcode.com/problems/valid-parentheses/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =  0 ;i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch =='(' || ch =='{' || ch =='[')
            {
                stack.push(ch);
            }
            else if( !stack.isEmpty() && ((stack.peek() =='(' && ch ==')') || (stack.peek() == '{' && ch =='}') || (stack.peek() =='[' && ch ==']')))
            {
                stack.pop();
            }
            else{
                return false;
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
    }
}