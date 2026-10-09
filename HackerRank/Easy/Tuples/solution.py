# HackerRank Problem: Tuples 
# Link: https://www.hackerrank.com/challenges/python-tuples/problem
# Difficulty: Easy
# Language: python

if __name__ == '__main__':
    n = int(raw_input())
    integer_list = map(int, raw_input().split())
    t=tuple(integer_list)
    print(hash(t))
