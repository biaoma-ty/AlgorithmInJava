package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by F7753 on 6/4/16.
 */
public class IntersectionofTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];

        ArrayList<Integer> ret = new ArrayList<Integer>();
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], true);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]))
                ret.add(nums2[i]);
        }

        int[] res = new int[ret.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ret.get(i);
        }

        return res;
    }

}
