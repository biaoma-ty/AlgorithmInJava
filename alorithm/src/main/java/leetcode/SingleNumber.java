package leetcode;

import java.util.Arrays;

/**
 * Created by F7753 on 6/13/16.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
            res=((res|~nums[i]) & (~res|nums[i]));
        //(a or !b) and (!a or b) 1 for same; 0 for  different
        return res;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] test = {1,2,5,6,2,5,4,6,1};
        System.out.println(sn.singleNumber(test));
    }
}
