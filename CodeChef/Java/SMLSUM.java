
import java.io.*;
import java.util.*;

class Solution {
    static class Pair implements Comparable<Pair> {
        int a, b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public int compareTo(Pair other) {
            return Integer.compare(this.a, other.a);
        }
    }

    public static void main(String[] args) throws 
        IOException {
        BufferedReader br = new BufferedReader(new 
            InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] nq = br.readLine().split(" ");
            int n = Integer.parseInt(nq[0]);
            int q = Integer.parseInt(nq[1]);

            Pair[] pairs = new Pair[n];
            String[] aStr = br.readLine().split(" ");
            String[] bStr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {