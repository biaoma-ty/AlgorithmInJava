import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by F7753 on 5/16/16.
 * Given an array S of n integers, are there elements a, b, c in
 * S such that a + b + c = 0? Find all unique triplets in the array
 * which gives the sum of zero.
 *
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets.
 *
 * For example, given array S = {-1 0 1 2 -1 -4},
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if (length < 3)
            return  res;

        for (int i = 0; i <length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (j + 2 <= length) {
                    int target = 0 - nums[i] - nums[j];
                    int targetIndex = Arrays.binarySearch(nums, j + 1, length, target);

                    if (targetIndex > 0) {
                        ArrayList<Integer> item = new ArrayList<Integer>(3);
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(target);
                        res.add(item);
                    }
                }
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        int[] S = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = ThreeSum.threeSum(S);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
