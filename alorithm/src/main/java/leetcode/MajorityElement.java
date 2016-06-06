package leetcode;

import java.util.HashMap;

/**
 * Created by F7753 on 6/6/16.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ret = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int item = nums[i];
            if (!map.containsKey(item)) {
                map.put(nums[i], 1);
            } else {
                int cnt = map.get(item);
                map.put(item, ++cnt);
                ret = cnt > map.get(ret) ? item : ret;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 5, 5, 5};
        System.out.println(new MajorityElement().majorityElement(test));
    }
}
