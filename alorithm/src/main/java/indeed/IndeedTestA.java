package indeed; /**
 * Created by F7753 on 6/4/16.
 */
import java.util.*;
public class IndeedTestA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        char[] origin = new char[4];
        origin[0] = 'a';
        origin[1] = 'b';
        origin[2] = 'c';
        origin[3] = 'd';

        String[] one = {"a", "b", "c", "d"};
        String[] two = new String[16];
        String[] three = new String[64];
        String[] four = new String[256];

        if (S.length() == 1) {
            for (int i = 0; i < one.length; i++) {
                System.out.println(one[i]);
            }
        } else if (S.length() == 2) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {

                    if (!S.contains(one[i]) || !S.contains(one[j]))
                        System.out.println(one[i] + one[j]);
                }
            }
        } else if (S.length() == 3) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (!S.contains(one[i]) || !S.contains(one[j]) || !S.contains(one[k]))
                            System.out.println(one[i] + one[j] + one[k]);
                    }
                }
            }
        } else if (S.length() == 4) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 4; l++) {
                            if (!S.contains(one[i]) || !S.contains(one[j]) || !S.contains(one[k]) || !S.contains(one[l]))
                                System.out.println(one[i] + one[j] + one[k] + one[l]);
                        }
                    }
                }
            }
        }

    }
}
