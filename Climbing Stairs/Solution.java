public class Solution {
    public static int climbStairs(int n) {
        int f[] = new int[n + 2];
        int i;

        f[0] = f[1] = 1;

        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public static void main(String args[]) {
        int ans = climbStairs(4);
        int expected = 5;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + ans);
    }
}