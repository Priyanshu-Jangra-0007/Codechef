import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] pre = new int[n];
        int[] suf = new int[n];
        int[] v1 = new int[n];

        for (int i = 0; i < n; i++) {
            v1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            pre[i] = (i == 0) ? v1[i] : gcd(v1[i], pre[i - 
                1]);
        }

        for (int i = n - 1; i >= 0; i--) {
            suf[i] = (i == n - 1) ? v1[i] : gcd(v1[i], suf[i 
                + 1]);
        }

        int fans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fans = Math.max(fans, suf[i + 1]);
            } else if (i == n - 1) {
                fans = Math.max(fans, pre[i - 1]);
            } else {