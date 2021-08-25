class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         int largest = Math.max(nums1.length, nums2.length);
//         if(nums1.length > nums2.length) {
//             for(int i: nums1) {
//                 for(int j: nums2) {
//                     if(i == j) {
//                         arr.add(i); 
//                     }
//                 }
//             }
//         }
//         else {
//             for(int i: nums2) {
//                 for(int j: nums1) {
//                     arr.add(i); 
//                 }
//             }
//         }
        
//         HashSet<Integer> hs = new HashSet<>();
//         for(int k=0; k<arr.size(); k++) {
//             hs.add(arr.get(k));
//         }
//         int[] ans = new int[hs.size()];
//         int count = 0;
//         for(int i: hs) {
//             ans[count] = i;
//             count++;
//         } 
//         return ans;
            HashSet<Integer> set1 = new HashSet<Integer>();
    for (Integer n : nums1) set1.add(n);
    HashSet<Integer> set2 = new HashSet<Integer>();
    for (Integer n : nums2) set2.add(n);

    set1.retainAll(set2);

    int [] output = new int[set1.size()];
    int idx = 0;
    for (int s : set1) output[idx++] = s;
    return output;
    }
}