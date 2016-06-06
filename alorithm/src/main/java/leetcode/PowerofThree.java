package leetcode;

/**
 * Created by F7753 on 6/6/16.
 */
public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        while (n > 1) {
            if (n % 3 != 0)
                return false;
            else
                n = n / 3;
        }
        if (n == 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int test = 12;
        System.out.println(new PowerofThree().isPowerOfThree(test));
    }
}
