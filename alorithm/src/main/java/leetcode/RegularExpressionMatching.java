package leetcode;

/**
 * Created by F7753 on 5/18/16.
 * Implement regular expression matching with support for '.' and '*'.
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if (s.equals(p) || p.equals(""))
            return true;
        if (p.charAt(0) == '.')
            return false;
        char[] stringArray = s.toCharArray();
        char[] patternArray = p.toCharArray();

        for (int i = 0, k = 0; i < stringArray.length; i++) {
            if (k < patternArray.length) {
                if (stringArray[i] == patternArray[k] || patternArray[k] == '.')
                    k++;
                else if (patternArray[k] == '*') {
                    continue;
                } else
                    return false;
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        RegularExpressionMatching re = new RegularExpressionMatching();
        String s = "ab";
        String p = "a";
        System.out.println(re.isMatch(s, p));
    }
}
