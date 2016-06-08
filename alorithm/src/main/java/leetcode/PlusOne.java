package leetcode;

/**
 * Created by F7753 on 6/7/16.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {

        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            digits[i] += 1;
            System.out.println(i + " " + digits[i]);
            if (digits[i] < 10)
                return digits;
            else
                digits[i] = 0;
        }
        if (digits[0] == 0) {
            int[] res = new int[length + 1];
            res[0] = 1;
            for (int i = 0; i < length; i++) {
                res[i + 1] = digits[i];
            }
            return res;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] test = {9,9,9,9};
        int[] res = new PlusOne().plusOne(test);
        for (int item: res) {
            System.out.println(item);
        }
    }
}
