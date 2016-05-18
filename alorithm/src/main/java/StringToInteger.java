/**
 * Created by F7753 on 5/17/16.
 * Implement atoi to convert a string to an integer.
 * Hint: Carefully consider all possible input cases.
 * If you want a challenge, please do not see below and
 * ask yourself what are the possible input cases.
 * Notes: It is intended for this problem to be specified vaguely
 * (ie, no given input specs). You are responsible to gather all the input requirements up front.
 */
public class StringToInteger {
    public int myAtoi(String str) {
        char[] origin = str.toCharArray();
        int length = origin.length;
        int i = 0;
        int res = 0;
        boolean flag = false;
        boolean overFlow = false;
        boolean judged = false;
        boolean started = false;
        while (i < length) {
            if (origin[i] == '-') {
                if (judged == true) {
                    return 0;
                }
                flag = true;
                judged = true;
                started = true;
            } else if (origin[i] == '+') {
                if (judged == true) {
                    return 0;
                }
                judged = true;
                started = true;
            } else if ((origin[i] <= 57) && (origin[i] >= 48)) {
                int target = origin[i] - 48;
                if ((Integer.MAX_VALUE - target) / 10 < res ) {
                    overFlow = true;
                }
                res = res * 10 + target;
                started = true;
            } else if (!started && origin[i] == ' ')
                ;
            else if (started)
                break;
            else
                break;
            i++;
        }
        if (overFlow == true)
            return flag == true? Integer.MIN_VALUE : Integer.MAX_VALUE;

        return flag == true? -res : res;
    }

    public static void main(String[] args) {
        String test = "   +0 123";
        StringToInteger st = new StringToInteger();
        System.out.println(st.myAtoi(test));
    }
}
