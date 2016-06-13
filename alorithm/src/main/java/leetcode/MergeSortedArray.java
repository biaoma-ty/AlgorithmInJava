public class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int nums1Index = m - 1;
        int nums2Index = n - 1;
        
        for(int i=1; i<=m+n; i++){
            if (nums1Index == -1) {
                    while (nums2Index >= 0) {
                        nums1[nums2Index] = nums2[nums2Index];
                        nums2Index--;
                    }
                    return;

            }
            if (nums2Index == -1) {
                return;
            }
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[m+n-i] = nums1[nums1Index];
                nums1Index--;
            } else {
                nums1[m+n-i] = nums2[nums2Index];
                nums2Index--;
            }
        }            
    }

    public static void main(String[] args){
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        MergeSortedArray ms = new MergeSortedArray();
        ms.merge(nums1,3,nums2,3);
        for (int i = 0; i < 6; i++){
            System.out.println(nums1[i]);
        }
    }
}
