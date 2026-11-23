// LeetCode Problem: Product of the Last K Numbers
// Link: https://leetcode.com/problems/product-of-the-last-k-numbers/
// Difficulty: Medium
// Language: java

class ProductOfNumbers {
    List<Integer> prefix = new ArrayList<>();
    public ProductOfNumbers() {
        prefix.add(1);

    }
    
    public void add(int num) {
        if(num == 0){
            prefix.clear();
            prefix.add(1);
        }
        else{
            int n = prefix.size();
            int product = prefix.get(n - 1) * num;
            prefix.add(product); 
        }
    }
    
    public int getProduct(int k) {
        if(k >= prefix.size()){
            return 0;
        }
        else{
            int n = prefix.size();
            int ans = prefix.get(n - 1)/prefix.get(n - k - 1);
            return ans;
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */