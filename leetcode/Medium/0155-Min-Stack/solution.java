// LeetCode Problem: Min Stack
// Link: https://leetcode.com/problems/min-stack/
// Difficulty: Medium
// Language: java

class MinStack {
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> stack = new Stack<>();
    public MinStack() {
    }
    
    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty() || minStack.peek() >= value)
        {
            minStack.push(value);
        }
        
    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek()))
        {
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
       return minStack.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */