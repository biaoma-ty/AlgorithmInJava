package leetcode;

/**
 * Created by F7753 on 5/16/16.
 * The string "PAYPALISHIRING" is written in a zigzag pattern
 * on a given number of rows like this: (you may want to display
 * this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {

        if (s.length() < 2 || numRows == 1)
            return s;

        char[] origin = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int width = (numRows - 1) << 1;

        for (int i = 0; i < numRows; i++) {
            getRow(origin, sb, width, i);
        }

        return sb.toString();
    }

    public void getRow(char[] array, StringBuilder sb, int width, int row) {
        int space = width - (row << 1);
        int index = row;

        while (index < array.length) {
            sb.append(array[index]);
            int target = index + space;
            if (0 < space && space < width && target < array.length) {
                sb.append(array[target]);
            }
            index += width;
        }
    }

    public static void main(String[] args) {
        String test = "AsdfsfdfwB";
        ZigZagConversion zz = new ZigZagConversion();
        System.out.println(zz.convert(test, 4));
    }
}
