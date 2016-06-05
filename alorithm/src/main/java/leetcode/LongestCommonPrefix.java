package leetcode;

/**
 * Created by F7753 on 5/19/16.
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        int minLength = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            minLength = Math.min(strs[i].length(), minLength);
        }
        StringBuilder sb = new StringBuilder(minLength);
        for (int i = 0; i < minLength; i++) {

            sb.append(strs[0].charAt(i));
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != sb.charAt(i)) {
                    sb.deleteCharAt(sb.length() - 1);
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] test = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(test));
    }
}
