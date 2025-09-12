package questions.stack;

import java.util.Arrays;
import java.util.Scanner;

//Game of Two Stacks: HackerRank
public class TwoStacks {

    private static int twoStacks(int x, int[] a, int[] b) {
        return twoStacks(x, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        if (sum > x) {
            return count;
        }

        if (a.length == 0 || b.length == 0) {
            return count;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
//        int[] a = {4, 2, 4, 6, 1};
//        int[] b = {2, 1, 8, 5};
//        int x = 10;
//        System.out.println(twoStacks(x, a, b));

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            int x = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = input.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = input.nextInt();
            }
            System.out.println("Count: " + twoStacks(x, a, b));
        }
        input.close();
    }
}
