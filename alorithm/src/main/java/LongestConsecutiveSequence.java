import java.util.HashMap;

/**
 * Created by F7753 on 5/31/16.
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * Your algorithm should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> used = new HashMap<Integer, Boolean>();
        for (int i = 0; i < nums.length; i++) {
            used.put(i, false);
        }
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (used.get(i))
                continue;
            int length = 1;
            used.put(i, true);

            for (int j = i + 1; used.containsKey(j) ; ++j) {
                used.put(j, true);
                ++ length;
            }

            for (int j = i - 1; used.containsKey(j); --j) {
                used.put(j, true);
                ++length;
            }
            longest = Math.max(longest, length);
        }

        return  longest;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0};
        LongestConsecutiveSequence ls = new LongestConsecutiveSequence();
        System.out.println(ls.longestConsecutive(nums));
    }
}
