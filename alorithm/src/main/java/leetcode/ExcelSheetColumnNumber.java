package leetcode;

/**
 * Created by F7753 on 6/6/16.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int ret = 0;

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
//            System.out.println(item);
            ret = ret * 26 + (item - 64);
//            System.out.println(ret);
        }

        return ret;
    }

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        long a = 26;
        for (int i = 0; i < 10; i++) {
            a = a * a;
        }
        System.out.println(System.currentTimeMillis() - start);

        Long start1 = System.currentTimeMillis();
        long b = 26;
        Math.pow(b, 10);
        System.out.println(System.currentTimeMillis() - start1);
    }
}
