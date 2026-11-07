// LeetCode Problem: Minimum Window Substring
// Link: https://leetcode.com/problems/minimum-window-substring/
// Difficulty: Hard
// Language: java

class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length())
        {
            return "";
        }  
        HashMap<Character,Integer> target = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for(int i = 0 ; i < t.length() ; i++)
        {
            target.put(t.charAt(i),target.getOrDefault(t.charAt(i),0) + 1);
        }
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int formed = 0;
        int required = target.size();
        int startIndex = 0;
        for(int right = 0 ; right < s.length() ; right++)
        {
            window.put(s.charAt(right), window.getOrDefault(s.charAt(right), 0) + 1);
            if(target.containsKey(s.charAt(right)))
            {
                if(window.get(s.charAt(right)).equals(target.get(s.charAt(right))))
                {
                    formed += 1;
                }
            }
            while(formed == required)
            {
                int currentLength = right - left + 1;
                if(currentLength < minLength)
                {
                    minLength = currentLength;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                if(target.containsKey(leftChar))
                {
                    window.put(leftChar,window.get(leftChar) - 1);
                    if(window.get(leftChar) < target.get(leftChar))
                    {
                        formed--;
                    }
                }
                left++;

            }
            
        }
        if(minLength == Integer.MAX_VALUE)
            {
                return "";
            }
        return s.substring(startIndex, startIndex + minLength);
        
    }
}