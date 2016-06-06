package leetcode;

import java.util.HashMap;

/**
 * Created by F7753 on 6/6/16.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2 ) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int item = nums[i];
            if (map.containsKey(item)) {
                return true;
            } else {
                map.put(item, 1);
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] test = {1, 3, 2, 1};
        System.out.println(new ContainsDuplicate().containsDuplicate(test));
    }
}
