package leetcode;

/**
 * Created by F7753 on 6/7/16.
 */
public class ClimbingStair {
    public int climbStairs(int n) {
        int[] dp = {0, 1, 2};
        for(int i = 3; i <= n; i++) {
            dp[i%3] = dp[(i-1)%3] + dp[(i-2)%3];
            System.out.println(dp[i%3] + " " + dp[(i-1)%3] + " " + dp[(i-2)%3]);
        }
        return dp[n%3];
    }

    public static void main(String[] args) {
        ClimbingStair cs = new ClimbingStair();
        System.out.println(cs.climbStairs(4));
    }
}
