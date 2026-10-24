// HackerRank Problem: Down to Zero II
// Link: https://www.hackerrank.com/challenges/down-to-zero-ii/problem
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
     * Complete the 'downToZero' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
    static final int MAX = 1_000_000;
    static int[] dp  =new int[MAX+1];
  static {
        for (int i = 0; i <= MAX; i++) {
            dp[i] = i;
        }

        for (int i = 1; i <= MAX; i++) {
            for (int j = 2; j <= i && (long) i * j <= MAX; j++) {
                int product = i * j;
                dp[product] = Math.min(dp[product], dp[i] + 1);
            }

            if (i < MAX) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }
        }
    }

public static int downToZero(int n) {
    // Write your code here
    return dp[n];
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.downToZero(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
