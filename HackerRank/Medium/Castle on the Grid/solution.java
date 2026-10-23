// HackerRank Problem: Castle on the Grid
// Link: https://www.hackerrank.com/challenges/castle-on-the-grid/problem
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
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY grid
     *  2. INTEGER startX
     *  3. INTEGER startY
     *  4. INTEGER goalX
     *  5. INTEGER goalY
     */

    public static int minimumMoves(List<String> grid, int startX, int startY, int goalX, int goalY) {
    // Write your code here
    int n = grid.size();
    Queue<int[]> queue = new LinkedList<>();
    boolean [][]visited = new boolean[n][n];
    queue.offer(new int[]{startX,startY,0});
    visited[startX][startY] = true;
    int dx[] = {-1,1,0,0};
    int dy[] = {0,0,-1,1};
        
    while(!queue.isEmpty())
    {
        int[] current = queue.poll();
        int row = current[0];
        int col = current[1];
        int moves = current[2];
        if(row == goalX && col == goalY)
        {
            return moves;
        }
        for(int d = 0 ; d< 4  ; d++)
        {
        int nextRow = row + dx[d];
        int nextCol = col + dy[d];
        while(nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < n)
        {
            if(grid.get(nextRow).charAt(nextCol) == 'X')
            {
                break;
            }
            if(!visited[nextRow][nextCol])
            {
            visited[nextRow][nextCol] = true;
            queue.offer(new int[]{nextRow,nextCol,moves+1});
            }
            nextRow += dx[d];
            nextCol += dy[d];
        }
        }
    
    }
    return -1;

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int startX = Integer.parseInt(firstMultipleInput[0]);

        int startY = Integer.parseInt(firstMultipleInput[1]);

        int goalX = Integer.parseInt(firstMultipleInput[2]);

        int goalY = Integer.parseInt(firstMultipleInput[3]);

        int result = Result.minimumMoves(grid, startX, startY, goalX, goalY);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
