package leetcode;

/**
 * Created by F7753 on 5/30/16.
 * Follow up for ”Remove Duplicates”: What if duplicates are allowed at most twice?
 * For example, Given sorted array A = [1,1,1,2,2,3],
 * Your function should return length = 5, and A is now [1,1,2,2,3]
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int flag = 0;
        int index = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2])
                nums[++index] = nums[i];
        }

        return  index;
    }

    public static void main(String[] args) {
        System.out.println("LL");
    }
}
