class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for(int i=m; i<(m+n); i++) {
            nums1[i] = nums2[count];
            count++;
        }
        System.out.println(Arrays.toString(nums1));
        // bubble sort
        boolean swapped;
        for(int i=0; i<nums1.length; i++) {
            swapped = false;
            for(int j=1; j<nums1.length-i; j++) {
                if(nums1[j-1] > nums1[j]) {
                    int temp = nums1[j-1];
                    nums1[j-1] = nums1[j];
                    nums1[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}