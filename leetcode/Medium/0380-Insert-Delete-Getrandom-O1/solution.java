// LeetCode Problem: Insert Delete GetRandom O(1)
// Link: https://leetcode.com/problems/insert-delete-getrandom-o1/
// Difficulty: Medium
// Language: java

class RandomizedSet {
    HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
       if(map.containsKey(val))
       {
            return false;
       }
       list.add(val);
       map.put(val, list.size() - 1);
       return true;
    }
    
    public boolean remove(int val) {
       if(!map.containsKey(val))
       {
        return false;
       }
       int index = map.get(val);
       int lastIndex = list.size() - 1;
       int lastElement = list.get(lastIndex);

       list.set(index,lastElement);
       list.remove(lastIndex);
       map.put(lastElement,index);
       map.remove(val);

       return true;  
    }
    
    public int getRandom() {
       Random rand = new Random();
       int index = rand.nextInt(list.size());
       return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */