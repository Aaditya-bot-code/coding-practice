// LeetCode Problem: Gas Station
// Link: https://leetcode.com/problems/gas-station/
// Difficulty: Medium
// Language: java

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas= 0;
        int totalCost = 0;
        int currentGas = 0;
        int start = 0;
        for(int i = 0 ; i < gas.length ; i++)
        {
            int diff = gas[i] - cost[i];
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += diff;

            if(currentGas < 0)
            {
                start = i + 1;
                currentGas = 0;
            }
        }
        if(totalGas < totalCost)
        {
            return -1;
        }
        return start;
    }
}