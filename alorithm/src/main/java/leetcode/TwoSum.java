package leetcode; /**
 * Created by F7753 on 5/16/16.
 *
 * Given an array of integers, return indices of the two numbers such that
 * they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 */

import java.util.HashMap;
import java.lang.Integer;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(length);
        map.put(nums[0], 0);
        for (int i = 1; i <length; i++) {
            int geted = nums[i];
            boolean rep = (target - nums[i])== geted;

            if (rep && map.containsKey(geted)) {

                res[0] = map.get(geted);
                res[1] = i;
                System.out.println(geted + "[[" + i);
                return  res;
            } else
                map.put(geted, i);

            System.out.println(nums[i] + "--" + map.get(nums[i]));
        }

        for (int i = 0; i < length; i++) {
            int geted = nums[i];
            if ((target - geted)== nums[i])
                map.remove(geted);
            int wanted = target - geted;
            System.out.println(i + "==" + nums[i] + "==" + wanted);
            if (map.containsKey(wanted)) {
                res[0] = i;
                res[1] = map.get(wanted);
                System.out.println(wanted + "->" + i);
                return res;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] test = {0,4,3,0};
        int[] res = TwoSum.twoSum(test, 0);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
