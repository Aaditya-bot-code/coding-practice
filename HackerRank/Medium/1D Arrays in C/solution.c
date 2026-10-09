// HackerRank Problem: 1D Arrays in C
// Link: https://www.hackerrank.com/challenges/1d-arrays-in-c/problem
// Difficulty: Medium
// Language: c

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i,n,s=0;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
    for(i=0;i<n;i++)
    s+=a[i];
    printf("%d",s);

       
    return 0;
}
