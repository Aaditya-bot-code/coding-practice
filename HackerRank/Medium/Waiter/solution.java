// HackerRank Problem: Waiter
// Link: https://www.hackerrank.com/challenges/waiter/problem
// Difficulty: Medium
// Language: java15

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'waiter' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY number
     *  2. INTEGER q
     */
    static Boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i = 2 ; i* i <= n ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
            
        }
        return true;
    }
    public static List<Integer> waiter(List<Integer> number, int q) {
    // Write your code here
    Stack<Integer> current = new Stack<>();
    List<Integer> answers = new ArrayList<>();
    for(int num : number)
    {
        current.push(num);
    }
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();
    int prime = 2;
    for(int i = 0 ; i< q ;i++)
    {
        while(!isPrime(prime))
        {
            prime++;
        }
        while(!current.empty())
        {
        int plate = current.pop();
        if(plate % prime == 0)
        {
           B.push(plate); 
        }
        else{
            A.push(plate);
        }
        }
        while(!B.empty())
        {
            answers.add(B.pop());
        }
        current = A;
        prime++;
        A = new Stack<>();
        B = new Stack<>();
    }
    while(!current.empty())
    {
        answers.add(current.pop());
    }
    return answers;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> number = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.waiter(number, q);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
