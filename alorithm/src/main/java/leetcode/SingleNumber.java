package leetcode;

import java.util.Arrays;

/**
 * Created by F7753 on 6/13/16.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        Arrays.sort(nums);

        for (int i = 1, j = 0; i < nums.length && j < nums.length; i+=2, j+=2) {
            if (nums[i] != nums[j])
                return nums[j];
        }

        return nums[nums.length - 1];
    }
}
