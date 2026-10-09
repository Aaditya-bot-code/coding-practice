# Tuples 

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Tuples ](https://www.hackerrank.com/challenges/python-tuples/problem)

## Problem Description

**Task** **
Given an integer, , and  space-separated integers as input, create a tuple, , of those  integers. Then compute and print the result of .

Note:** [hash()](https://docs.python.org/3/library/functions.html#hash) is one of the functions in the `__builtins__` module, so it need not be imported.

**Input Format**

The first line contains an integer, , denoting the number of elements in the tuple. **
The second line contains  space-separated integers describing the elements in tuple .

Output Format**

Print the result of .

**Sample Input 0**

```
2
1 2

```

**Sample Output 0**

```
3713081631934410656

```

## Examples



## Constraints



## Solution

```python
# HackerRank Problem: Tuples 
# Link: https://www.hackerrank.com/challenges/python-tuples/problem
# Difficulty: Easy
# Language: python

if __name__ == '__main__':
    n = int(raw_input())
    integer_list = map(int, raw_input().split())
    t=tuple(integer_list)
    print(hash(t))

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
