package leetcode;

/**
 * Created by F7753 on 6/8/16.
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        return num > 0 && 1073741824 % num == 0 && num % 3 == 1;
    }

    public static void main(String[] args) {
        System.out.println(new PowerOfFour().isPowerOfFour(8));
    }
}
