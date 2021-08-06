class Solution {
    public int searchInsert(int[] nums, int target) {
        int found = Arrays.binarySearch(nums, target);
        if(found >= 0) {
            return found;
        }
        else {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i: nums) {
                arr.add(i);
            }
            
            arr.add(target);
            Collections.sort(arr); 
            return arr.indexOf(target);
        }
    }
}