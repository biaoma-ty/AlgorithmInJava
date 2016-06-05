package leetcode;

/**
 * Created by F7753 on 5/16/16.
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there
 * exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        if(s==null){
            return "";
        }
        char[] arr = s.toCharArray();
        int max = 0;
        int maxi = 0;
        int maxj = 0;

        for(int i = 0; i< arr.length;){
            int i1 = getFarestSameElementIndex(arr,i);
            int dist = getDistance(arr,i,i1);
            int index1 = i-dist;
            int index2 = i1 + dist;
            int l = index2 - index1;
            if(l>max){
                max = l;
                maxi = index1;
                maxj = index2;
            }
            i = i1+1;
        }

        return s.substring(maxi, maxj+1);
    }


    private int getDistance(char[] arr,int index1,int index2){
        int i1 = index1-1;
        int i2 = index2+1;
        int dist = 0;
        while(i1>=0&&i2<arr.length){
            if(arr[i1]==arr[i2]){
                dist++;
            }else{
                break;
            }
            i1--;i2++;
        }
        return dist;
    }

    private int getFarestSameElementIndex(char[] arr, int index){
        for(int i = index+1;i<arr.length;i++){
            if(arr[i]!=arr[index]){
                return i-1;
            }
        }
        return arr.length-1;
    }

    public static void main(String[] args) {
        String testString = "zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir";
        LongestPalindromicSubstring test = new LongestPalindromicSubstring();
        System.out.println("=>" + test.longestPalindrome(testString));
    }
}
