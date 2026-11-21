// LeetCode Problem: Find Subtree Sizes After Changes
// Link: https://leetcode.com/problems/find-subtree-sizes-after-changes/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        List<Integer>[] tree = new ArrayList[n]; 
        for(int i = 0; i < n; i++){
            tree[i] = new ArrayList<>();
        }
        for(int i = 1; i < n; i++){
            tree[parent[i]].add(i);
        }
        int[] nearest = new int[26];
        Arrays.fill(nearest,-1);

        int[] newParent = parent.clone();
        dfs(0, tree, s, nearest, newParent);
        List<Integer>[] newTree = new ArrayList[n];

        for(int i = 0; i < n; i++){
            newTree[i] =new ArrayList<>();
        }

        for(int i = 1 ; i < n ; i ++){
            newTree[newParent[i]].add(i);
        }
        int[] ans = new int[n];
        calculateSize(0, newTree, ans);

        return ans;
    }
    private void dfs(int node, List<Integer>[] tree, String s, int[] nearest, int[] newParent){
        int ch = s.charAt(node) - 'a';
        int old = nearest[ch];
        if(old != -1){
            newParent[node] = old;
        }
        nearest[ch] = node;
        for(int child : tree[node]){
            dfs(child, tree, s, nearest, newParent);
        }

        nearest[ch] = old;

    }
    private int calculateSize(int node, List<Integer>[] tree, int[] ans){
        ans[node] = 1;
        for(int child : tree[node]){
            ans[node] += calculateSize(child, tree, ans);
        }
        return ans[node];
    }
}