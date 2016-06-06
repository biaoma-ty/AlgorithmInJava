package leetcode;

/**
 * Created by F7753 on 6/6/16.
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        int[] divisors = {2, 3, 5};

        for(int d : divisors) {
            while (num % d == 0) {
                num /= d;
                System.out.println(num);
            }
        }
        return num == 1;
    }

    public static void main(String[] args) {
        UglyNumber un = new UglyNumber();
        System.out.println(un.isUgly(40));
    }
}
