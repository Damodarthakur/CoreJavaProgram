package CorTest;


public class StaircaseClimbing {

    public static int countWays(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: There's 1 way to reach 0 steps
        dp[1] = 1; // Base case: There's 1 way to reach 1 step

        for (int i = 2; i <= n; i++) {
            // To reach the i-th step, you can either take a 1-step from the (i-1)-th step
            // or a 2-step from the (i-2)-th step
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 2;
        int ways = countWays(n);
        System.out.println("Number of ways to reach the top of " + n + " steps: " + ways);
    }
}
