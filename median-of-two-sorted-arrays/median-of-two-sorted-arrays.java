class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged =  new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length; i++) {
            merged[i] = nums1[i];
        }
        int count = 0;
        for(int j=nums1.length; j<merged.length; j++) {
            merged[j] = nums2[count];
            count++;
        }
        Arrays.sort(merged);
        if(merged.length%2 == 0) {
            int mid1 = merged[(merged.length / 2) - 1];
            int mid2 = merged[(merged.length / 2)];
            double median = ((mid1 + mid2) / 2.0);
            return median;
        }
        else {
            int mid = ((merged.length - 1) / 2);
            double median = merged[mid];
            return median;
        }
    }
}