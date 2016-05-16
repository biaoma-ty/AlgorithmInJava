/**
 * Created by F7753 on 5/16/16.
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity
 * should be O(log (m+n)).
 */
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        for(int i = 0, j = 0, k = 0; i < nums1.length || j < nums2.length; ++k) {
            if(i == nums1.length) {
                nums3[k] = nums2[j++];
            } else if(j == nums2.length) {
                nums3[k] = nums1[i++];
            } else if(nums1[i] <= nums2[j]) {
                nums3[k] = nums1[i++];
            } else {
                nums3[k] = nums2[j++];
            }
        }
        return (nums3[nums3.length >> 1] + nums3[(nums3.length - 1) >> 1]) / 2.0;
    }

    public static void main(String[] args) {

    }
}
