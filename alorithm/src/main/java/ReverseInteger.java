/**
 * Created by F7753 on 5/17/16.
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean flag = false;

        if (x < 0) {
            flag = true;
            x = - x;
        }

        int res = 0;
        while ((x / 10) > 0 ) {
            int digit = x % 10;
            res = res * 10 + digit;
            System.out.println("->" + res + " " + digit);
            x = x / 10;
        }

        if (res > (Integer.MAX_VALUE - x % 10) / 10)
            return 0;
        res = res * 10 + x % 10;

        return flag == true? - res: res ;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        ReverseInteger res = new ReverseInteger();
        System.out.println(res.reverse(-2147483412));
        System.out.println(964632435 * 2);
    }
}
