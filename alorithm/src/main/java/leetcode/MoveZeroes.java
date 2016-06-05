package leetcode;

/**
 * Created by F7753 on 6/6/16.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(index == -1&&nums[i]==0){
                index = i;
            }
            if(nums[i]!=0&&index!=-1){
                nums[index] = nums[i];
                nums[i] = 0;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {0, 0, 1,6,0,9};
        MoveZeroes move = new MoveZeroes();
        move.moveZeroes(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
