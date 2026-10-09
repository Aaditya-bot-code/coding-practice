# HackerRank Problem: Designer Door Mat
# Link: https://www.hackerrank.com/challenges/designer-door-mat/problem
# Difficulty: Easy
# Language: python3

# Enter your code here. Read input from STDIN. Print output to STDOUT
# Read space-separated N and M from stdin
N, M = map(int, input().split())

# Upper part
for i in range(N // 2):
    pattern = ".|." * (2*i + 1)
    print(pattern.center(M, "-"))

# Middle line
print("WELCOME".center(M, "-"))

# Lower part
for i in range(N // 2 - 1, -1, -1):
    pattern = ".|." * (2*i + 1)
    print(pattern.center(M, "-"))
