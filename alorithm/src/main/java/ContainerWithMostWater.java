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

        int left=0;
        int right = height.length-1;
        int max=0,area;
        while(left<right) {
            int l = height[left];
            int r = height[right];
            if( l > r){
                area = (right-left) * r;
                while (height[--right] <= r);
            }else{
                area = (right-left) * l;
                while (height[++left] < l);
            }
            if (area > max) max = area;
        }
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater cwm = new ContainerWithMostWater();
        int[] test = {1,2,3};
        System.out.println(cwm.maxArea(test));
    }
}
