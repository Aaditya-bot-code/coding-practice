// LeetCode Problem: Integer to Roman
// Link: https://leetcode.com/problems/integer-to-roman/
// Difficulty: Medium
// Language: java

class Solution {
    public String intToRoman(int num) {
        int[] integerValue = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String output = "";
        for(int i = 0 ; i < integerValue.length ; i++)
        {
            while(integerValue[i] <= num)
            {
                num -= integerValue[i];
                output += symbol[i];
            }
        }
        return output;
}
}