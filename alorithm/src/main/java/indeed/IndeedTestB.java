package indeed;
/**
 * Created by F7753 on 6/4/16.
 */
import java.math.BigInteger;
import java.util.*;
public class IndeedTestB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String M = sc.next();
        char[] array = new char[S.length()];

        BigInteger repeat = new BigInteger(M, 10);
        BigInteger flag = new BigInteger("1", 10);
        BigInteger zero = new BigInteger("0", 10);
        while (repeat.compareTo(zero) > 0) {
            repeat = repeat.subtract(flag);
            S = convert(S, array);
        }
        System.out.println(S);
    }

    static String convert(String s, char[] array) {
        char head = s.charAt(0);
        int index = Integer.valueOf(head) - 48 - 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (i != index ) {
                array[i] = s.charAt(i + 1);
            } else if (i == index){
                array[i] = head;

                for (int j = i + 1; j < array.length; j++) {
                    array[j] = s.charAt(j);
                }
                break;
            }
        }

        return  new String(array);
    }
}
