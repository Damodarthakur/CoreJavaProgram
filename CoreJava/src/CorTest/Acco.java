package CorTest;


import java.util.Scanner;


    public class Acco {

        // Function to calculate number of ways to reach the top
        public static int countWays(int n) {
            // Base cases
            if (n == 0) {
                return 1; // There's 1 way to stay at the ground (do nothing)
            }
            if (n == 1) {
                return 1; // Only 1 way to reach the first step (1 step)
            }

            // Create an array to store results of subproblems
            int[] dp = new int[n + 1];

            // Initialize base cases
            dp[0] = 1;
            dp[1] = 1;

            // Fill the dp array for all steps from 2 to n
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            // The answer will be in dp[n]
            return dp[n];
        }

        public static void main(String[] args) {
            int n = 4; // Number of steps

            System.out.println("Number of ways to reach the top: " + countWays(n));
        }
    }
