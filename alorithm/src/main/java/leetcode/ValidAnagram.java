package leetcode;

import java.util.HashMap;

/**
 * Created by F7753 on 6/6/16.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = getStringMap(s);
        HashMap<Character, Integer> tMap = getStringMap(t);

        return sMap.equals(tMap);
    }
    private HashMap<Character, Integer> getStringMap(String s) {
        HashMap<Character, Integer> map = new  HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                int cnt = map.get(item);
                map.put(item, ++cnt);
            }
        }

        return  map;
    }

    public static void main(String[] args) {
        String s = "car";
        String t = "cat";

        System.out.println(new ValidAnagram().isAnagram(s, t));
    }
}
