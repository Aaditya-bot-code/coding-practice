// HackerRank Problem: Median Updates
// Link: https://www.hackerrank.com/challenges/median/problem
// Difficulty: Hard
// Language: java15


import java.io.*;
import java.util.*;

public class Solution {
    static TreeMap<Integer, Integer> left = new TreeMap<>();
    static TreeMap<Integer, Integer> right = new TreeMap<>();

    static int leftSize = 0;
    static int rightSize = 0;

    static void add(TreeMap<Integer, Integer> map, int num) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    static void remove(TreeMap<Integer, Integer> map, int num) {
        int count = map.get(num);

        if (count == 1) {
            map.remove(num);
        } else {
            map.put(num, count - 1);
        }
    }

    static void rebalance() {
        while (leftSize > rightSize + 1) {
            int num = left.lastKey();
            remove(left, num);
            add(right, num);
            leftSize--;
            rightSize++;
        }

        while (rightSize > leftSize + 1) {
            int num = right.firstKey();
            remove(right, num);
            add(left, num);
            rightSize--;
            leftSize++;
        }

        if (leftSize > 0 && rightSize > 0
                && left.lastKey() > right.firstKey()) {
            int a = left.lastKey();
            int b = right.firstKey();

            remove(left, a);
            remove(right, b);

            add(left, b);
            add(right, a);
        }
    }

    static void insert(int num) {
        if (leftSize == 0 || num <= left.lastKey()) {
            add(left, num);
            leftSize++;
        } else {
            add(right, num);
            rightSize++;
        }

        rebalance();
    }

    static boolean delete(int num) {
        if (left.containsKey(num)) {
            remove(left, num);
            leftSize--;
        } else if (right.containsKey(num)) {
            remove(right, num);
            rightSize--;
        } else {
            return false;
        }

        rebalance();
        return true;
    }

    static void printMedian() {
        if (leftSize + rightSize == 0) {
            System.out.println("Wrong!");
            return;
        }

        if (leftSize > rightSize) {
            System.out.println(left.lastKey());
        } else if (rightSize > leftSize) {
            System.out.println(right.firstKey());
        } else {
            long sum = (long) left.lastKey() + right.firstKey();

            if (sum % 2 == 0) {
                System.out.println(sum / 2);
            } else {
                System.out.println(String.format(
                    java.util.Locale.US, "%.1f", sum / 2.0
                ));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < n; i++) {
            StringTokenizer st =
                new StringTokenizer(br.readLine());

            String operation = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (operation.equals("a")) {
                insert(num);
                printMedian();
            } else if (operation.equals("r")) {
                if (!delete(num)) {
                    System.out.println("Wrong!");
                } else {
                    printMedian();
                }
            }
        }
    }
}
