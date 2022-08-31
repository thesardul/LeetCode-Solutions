class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        for (int k = m+n-1; k >= 0; k--) {
            if (index1 == -1) {
                nums1[k] = nums2[index2--];
            } else if (index2 == -1) {
                nums1[k] = nums1[index1--];
            } else if (nums1[index1] < nums2[index2]) {
                nums1[k] = nums2[index2--];
            } else {
                nums1[k] = nums1[index1--];
            }
        }
    }
}