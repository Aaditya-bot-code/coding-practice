// LeetCode Problem: Simplify Path
// Link: https://leetcode.com/problems/simplify-path/
// Difficulty: Medium
// Language: java

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String result[] = path.split("/");
        for(int i = 0 ; i < result.length ; i++)
        {
            if(result[i].equals("") || result[i].equals("."))
            {
                continue;
            }
            else if(result[i].equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else{
                stack.push(result[i]);
            }

        }
        StringBuilder sb = new StringBuilder();
        for(String token : stack)
        {
            sb.append("/");
            sb.append(token);
        }
        if(sb.length() == 0)
        {
            return "/";
        }
        return sb.toString();

    }
}