package leetcode;

/**
 * Created by F7753 on 6/6/16.
 */
public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        int test = 12;
        System.out.println(new PowerofThree().isPowerOfThree(test));
    }
}
