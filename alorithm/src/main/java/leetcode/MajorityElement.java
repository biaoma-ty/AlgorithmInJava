package leetcode;

import java.util.HashMap;

/**
 * Created by F7753 on 6/6/16.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length ==0){
            return 0;
        }
        int count = 1;
        int major = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != major){
                count--;
            } else {
                count++;
            }
            if (count == 0){
                major = nums[i];
                count = 1;
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 5, 5, 5};
        System.out.println(new MajorityElement().majorityElement(test));
    }
}
