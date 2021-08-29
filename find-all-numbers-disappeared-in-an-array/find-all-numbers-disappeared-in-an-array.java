class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0; // iterator variable
        while(i < nums.length) { // loop from start to end
            int correct = nums[i] - 1;
            // check if nums[i] is below length and not equal to index
            if(nums[i] != nums[correct]) { 
                int temp = nums[i]; // swap
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }
        
        for(int j=0; j<nums.length; j++) {
            if(nums[j] - 1 != j) {
                arr.add(j+1);
            }
        }
        
        return arr;
    }
}