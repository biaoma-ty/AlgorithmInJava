package leetcode;

import java.util.HashSet;

/**
 * Created by F7753 on 6/7/16.
 */
public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        HashSet set = new HashSet();
        char[] array = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] chars = s.toCharArray();

        for (char item: array) {
            set.add(item);
        }

        int i = 0;
        while (i < chars.length-1) {
            while (i < chars.length-1 && !set.contains(chars[i])) {
                i++;
            }
            int prev = i;
            if (i < chars.length-1) i++;
            while (i < chars.length-1 && !set.contains(chars[i])) {
                i++;
            }
            int next = i;
            if (next != prev && set.contains(chars[prev]) && set.contains(chars[next])) {
                char tmp = chars[prev];
                chars[prev] = chars[next];
                chars[next] = tmp;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String test = ".a";
        System.out.println(new ReverseVowelsofaString().reverseVowels(test));
    }
}
