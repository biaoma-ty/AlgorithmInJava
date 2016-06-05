package leetcode;

/**
 * Created by F7753 on 5/18/16.
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return  false;
        else if (x < 10)
            return  true;
        int num = x;
        int ans = 0;
        while (num >= 10) {
            ans = ans * 10 + num % 10;
            num = num / 10;
        }
        ans = ans * 10 + num % 10;

        return  ans == x;
    }

    public static void main(String[] args) {

    }
}
