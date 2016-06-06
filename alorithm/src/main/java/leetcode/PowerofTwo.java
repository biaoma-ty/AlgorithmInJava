package leetcode;

/**
 * Created by F7753 on 6/6/16.
 */
public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && 1073741824 % n == 0;
    }

    public static void main(String[] args) {
        System.out.println(new PowerofTwo().isPowerOfTwo(10246));
    }
}
