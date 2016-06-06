package leetcode;

/**
 * Created by F7753 on 6/6/16.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int ret = 0;

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            System.out.println(item);
            ret = ret * 26 + (item - 64);
            System.out.println(ret);
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("ZA"));
    }
}
