# HackerRank Problem: String Formatting
# Link: https://www.hackerrank.com/challenges/python-string-formatting/problem
# Difficulty: Easy
# Language: python3

def print_formatted(number):
    # your code goes here
    width=len(bin(number))-2
    for i in range(1,number+1):
        deci=str(i).rjust(width)
        octa=oct(i)[2:].rjust(width)
        hexa=hex(i)[2:].upper().rjust(width)
        bina=bin(i)[2:].rjust(width)
        print(deci,octa,hexa,bina)
