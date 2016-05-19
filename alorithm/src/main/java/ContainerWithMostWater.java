/**
 * Created by F7753 on 5/18/16.
 * Given n non-negative integers a1, a2, ..., an,
 * where each represents a point at coordinate (i, ai). n
 * vertical lines are drawn such that the two endpoints of
 * line i is at (i, ai) and (i, 0). Find two lines, which
 * together with x-axis forms a container, such that the
 * container contains the most water.
 * Note: You may not slant the container.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int length = height.length;
        if (length <= 1)
            return  0;

        int res = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int tmp = (Math.min(height[i], height[j])) * (j - i);
                if (tmp > res)
                    res = tmp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ContainerWithMostWater cwm = new ContainerWithMostWater();
        int[] test = {1,2,3};
        System.out.println(cwm.maxArea(test));
    }
}
