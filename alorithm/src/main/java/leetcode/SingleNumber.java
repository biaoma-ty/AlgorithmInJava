package leetcode;

import java.util.Arrays;

/**
 * Created by F7753 on 6/13/16.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
            res ^= num;
        }
        return res;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] test = {1,2,5,6,2,5,4,6,1};
        System.out.println(sn.singleNumber(test));
    }
}
