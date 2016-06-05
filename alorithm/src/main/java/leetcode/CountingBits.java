package leetcode;

/**
 * Created by F7753 on 5/23/16.
 * Given a non negative integer number num.
 * For every numbers i in the range 0 ≤ i ≤ num
 * calculate the number of 1's in their binary
 * representation and return them as an array.
 *
 * e.g. For num = 5 you should return [0,1,1,2,1,2].
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = Integer.bitCount(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Integer.bitCount(4));
    }
}
