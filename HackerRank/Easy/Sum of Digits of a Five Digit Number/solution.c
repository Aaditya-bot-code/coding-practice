// HackerRank Problem: Sum of Digits of a Five Digit Number
// Link: https://www.hackerrank.com/challenges/sum-of-digits-of-a-five-digit-number/problem
// Difficulty: Easy
// Language: c

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n,r,s=0;
    scanf("%d", &n);
    if(n>=10000 && n<=99999)
    {
        while(n>0)
       {
        r=n%10;
        s=s+r;
        n=n/10;
       }
    }
    printf("%d",s);
    return 0;
}
