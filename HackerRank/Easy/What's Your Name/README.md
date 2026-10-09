# What's Your Name?

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [What's Your Name?](https://www.hackerrank.com/challenges/whats-your-name/problem)

## Problem Description

You are given the firstname and lastname of a person on two different lines. Your task is to read them and print the following:

**

Hello `firstname` `lastname`! You just delved into python.

Function Description**

Complete the *print_full_name* function in the editor below.

*print_full_name* has the following parameters:

* *string first:* the first name

* *string last:* the last name

**Prints**

* *string:* 'Hello  ! You just delved into python' where  and  are replaced with  and .

**Input Format**

The first line contains the first name, and the second line contains the last name.

**Constraints**

The length of the first and last names are each ≤ .

**Sample Input 0**

```
Ross
Taylor

```

**Sample Output 0**

```
Hello Ross Taylor! You just delved into python.

```

**Explanation 0**

The input read by the program is stored as a string data type. A string is a collection of characters.

## Examples



## Constraints



## Solution

```pypy3
// HackerRank Problem: What's Your Name?
// Link: https://www.hackerrank.com/challenges/whats-your-name/problem
// Difficulty: Easy
// Language: pypy3

#
# Complete the 'print_full_name' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING first
#  2. STRING last
#

def print_full_name(first, last):
    # Write your code here
    last=last+"!"
    print("Hello",first,last,"You just delved into python.")


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
