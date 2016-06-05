package leetcode;

import java.util.Arrays;

/**
 * Created by F7753 on 5/19/16.
 * Given an array S of n integers,
 * find three integers in S such that
 * the sum is closest to a given number,
 * target. Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 *
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int result = 0;
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i < nums.length - 2) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) return sum;
                else if (sum < target) while(nums[j++] == nums[j] && j < k);
                else while(nums[k--] == nums[k] && j < k);
                int diff = Math.abs(sum - target);
                if(diff < min) {
                    result = sum;
                    min = diff;
                }
            }
            while(nums[i++] == nums[i] && i < nums.length - 2);
        }
        return result;
    }
}
