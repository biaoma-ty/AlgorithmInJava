package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by F7753 on 6/6/16.
 */
public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums1.length; i++) {
            int item = nums1[i];
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                int cnt = map.get(item);
                map.put(item, ++cnt);
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            int item = nums2[i];
            if (map.containsKey(item)) {
                int cnt  = map.get(item);
                if (cnt > 0) {
                    res.add(item);
                    map.put(item, --cnt);
                }
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
