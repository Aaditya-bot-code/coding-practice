// LeetCode Problem: Substring with Concatenation of All Words
// Link: https://leetcode.com/problems/substring-with-concatenation-of-all-words/
// Difficulty: Hard
// Language: java

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if(words.length == 0)
        {
            return new ArrayList<>();
        }
        int wordLength = words[0].length();
        int wordCount = words.length;
        HashMap<String,Integer> frequency = new HashMap<>();
        for(int i = 0 ; i < words.length ; i++)
        {
            frequency.put(words[i], frequency.getOrDefault(words[i], 0) + 1);
        }
        List<Integer> result  = new ArrayList<>();
        for(int i = 0 ; i < wordLength ; i ++)
        {
            int left = i; 
            int right = i;
            int count = 0;

            HashMap<String,Integer> current = new HashMap<>();
            while(right + wordLength <= s.length())
            {
                String word = s.substring(right, right + wordLength);
                if(!frequency.containsKey(word)){
                    current.clear();
                    count = 0;
                    left = right + wordLength;
                    right += wordLength;
                    continue;
                }
                else{
                    current.put(word,current.getOrDefault(word, 0) + 1);
                    count++;
                }
                while(current.get(word) > frequency.get(word))
                {
                    String leftMost = s.substring(left, left + wordLength);
                    current.put(leftMost,current.get(leftMost) - 1);
                    left += wordLength;
                    count--;
                }
                if(count == wordCount)
                {
                    result.add(left);
                    String leftMost = s.substring(left, left + wordLength);
                    current.put(leftMost, current.get(leftMost) - 1);
                    left += wordLength;
                    count--;
                }
                right += wordLength;
                

            }

        }
        return result;
    }
}