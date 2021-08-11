class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i=0; i<index.length; i++) {
            ans.add(index[i], nums[i]);
        }
        
        for(int i=0; i<index.length;i++){
            arr[i]=(Integer)ans.get(i);
        }
        return arr;
    }
}