package leetcode;

import java.math.BigInteger;

/**
 * Created by F7753 on 6/4/16.
 */
public class test {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10", 10);
        BigInteger b = new BigInteger("1", 10);
        BigInteger c = new BigInteger("0", 10);
        System.out.println(a.subtract(b) );
        while (a.compareTo(c) > 0) {
            a = a.subtract(b);
            System.out.println(a);
        }
    }
}
